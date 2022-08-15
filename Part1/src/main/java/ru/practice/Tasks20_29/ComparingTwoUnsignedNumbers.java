package ru.practice.Tasks20_29;

/**
 * Сравнение двух беззнаковых чисел.
 * Написать программу, которая сравнивает два заданных числа как беззнаковые.
 */
public class ComparingTwoUnsignedNumbers {
	public static void main(String[] args) {
		int resultSigned = Integer.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
		int resultUnsigned = Integer.compareUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);

		System.out.println(resultSigned);
		System.out.println(resultUnsigned);
	}
}
