package ru.practice.Tasks20_29;

/**
 * Конвертирование в число посредством беззнаковой конверсии.
 * Написать программу, которая конвертирует заданное число типа int в число типа long с помощью беззнаковой конверсии.
 */
public class UnsignedConversion {
	public static void main(String[] args) {
		long result = Integer.toUnsignedLong(Integer.MIN_VALUE);
		System.out.println(result);
	}
}
