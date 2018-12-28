package io.bitbucket.brunosalves.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeZoneConverterTest {

    @Test
    public void conversionTest() throws Exception {
        String date = "2018-11-29T00:33:45.000Z";
        String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        String dateTimeZone = "UTC";

        TimeZoneConverter tzc = new TimeZoneConverter()
                .date(date)
                .dateFormat(dateFormat)
                .timeZone(dateTimeZone);

        assertEquals("2018-11-28T22:33:45.000Z", tzc.convertTo("America/Sao_Paulo"));
    }

    @Test
    public void formaterTest() throws Exception {
        String date = "2018-11-29T01:33:45.000Z";
        String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        String dateTimeZone = "UTC";

        TimeZoneConverter tzc = new TimeZoneConverter()
                .date(date)
                .dateFormat(dateFormat)
                .timeZone(dateTimeZone);

        String converted = tzc.convertTo("America/Sao_Paulo");

        assertEquals("20181128", tzc.format(converted, dateFormat, "yyyyMMdd"));
    }
}
