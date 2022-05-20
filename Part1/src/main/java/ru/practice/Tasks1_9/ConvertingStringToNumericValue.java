package ru.practice.Tasks1_9;

/**
 * Конвертирование строки в значение типа int, long, float или double.
 * Написать программу, которая конвертирует заданный объект типа string (представляющий число)
 * в значение типа int, long, float или double.
 */
public class ConvertingStringToNumericValue {

	private static final String TO_INT = "453";
	private static final String TO_LONG = "45234223233";
	private static final String TO_FLOAT = "45.823F";
	private static final String TO_DOUBLE = "13.83423D";

	public static void main(String[] args) {
		convertingVar1(TO_INT, TO_LONG, TO_FLOAT, TO_DOUBLE);
		convertingVar2(TO_INT, TO_LONG, TO_FLOAT, TO_DOUBLE);
	}

	private static void convertingVar1(String iint, String llong, String ffloat, String ddouble) {
		int toInt = Integer.parseInt(iint);
		long toLong = Long.parseLong(llong);
		float toFloat = Float.parseFloat(ffloat);
		double toDouble = Double.parseDouble(ddouble);
		System.out.println(toInt + " " + toLong + " " + toFloat + " " + toDouble);
	}

	private static void convertingVar2(String iint, String llong, String ffloat, String ddouble) {
		Integer toInt = Integer.valueOf(iint);
		Long toLong = Long.valueOf(llong);
		Float toFloat = Float.valueOf(ffloat);
		Double toDouble = Double.valueOf(ddouble);
		System.out.println(toInt + " " + toLong + " " + toFloat + " " + toDouble);
	}
}
