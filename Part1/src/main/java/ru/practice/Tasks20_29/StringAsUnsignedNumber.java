package ru.practice.Tasks20_29;

/**
 * Строка как беззнаковое число с основанием системы счисления.
 * Написать программу, которая разбирает и конвертирует заданную строку в беззнаковое число (типа int или long)
 * с заданным основанием системы счисления.
 */
public class StringAsUnsignedNumber {
	public static void main(String[] args) {
		String nri = "255500";
		int result1 = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);
		int result2 = Integer.parseUnsignedInt(nri);
		System.out.println(result1);
		System.out.println(result2);
	}
}
