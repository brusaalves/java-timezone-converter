package io.bitbucket.brunosalves.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneConverter {

    /**
     * Class attributes
     */
    private String date, dateFormat, timeZone;

    /**
     * Set a date attribute
     *
     * @param (String) Date
     * @return (TimeZoneConverter) Object instance
     */
    public TimeZoneConverter date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Set a date format attribute
     *
     * @param (String) Date format
     * @return (TimeZoneConverter) Object instance
     */
    public TimeZoneConverter dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Set a time zone attribute
     *
     * @param (String) Time zone
     * @return (TimeZoneConverter) Object instance
     */
    public TimeZoneConverter timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Convert a time zone of a date
     *
     * @param (String) Target time zone
     * @return (String) Converted date
     * @throws Exception
     */
    public String convertTo(String target) throws Exception {
        SimpleDateFormat sdfIn = new SimpleDateFormat(this.dateFormat);
        sdfIn.setTimeZone(TimeZone.getTimeZone(this.timeZone));
        Date dIn = sdfIn.parse(this.date);
        SimpleDateFormat sdfOut = new SimpleDateFormat(this.dateFormat);
        sdfOut.setTimeZone(TimeZone.getTimeZone(target));
        return sdfOut.format(dIn);
    }

    /**
     * Format a date using a specific pattern
     *
     * @param (String) Date
     * @param (String) Date format
     * @param (String) Pattern to format
     * @return (String) Formated date
     * @throws Exception
     */
    public String format(String date, String format, String pattern) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(date);
        sdf.applyPattern(pattern);
        return sdf.format(d);
    }
}