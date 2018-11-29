package com.utils.brunosalves2;

public class TimeZoneConverterImpl {

	public static void main(String[] args) {
		String date = "2018-11-29T01:33:45.000Z";
		String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String dateTimeZone = "UTC";

		TimeZoneConverter tzc = new TimeZoneConverter()
			.date(date)
			.dateFormat(dateFormat)
			.timeZone(dateTimeZone);
		
		try {
			String converted = tzc.convertTo("America/Sao_Paulo");
			System.out.println("Converted: " + converted);
			String formated = tzc.format(converted, dateFormat, "yyyyMMdd");
			System.out.println("Formated: " + formated);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
