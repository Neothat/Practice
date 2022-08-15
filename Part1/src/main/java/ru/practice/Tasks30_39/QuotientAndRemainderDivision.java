package ru.practice.Tasks30_39;

/**
 * Вычисление частного и остатка от деления беззнаковых значений.
 * Написать программу, которая вычисляет частное и остаток заданного беззнакового значения.
 */
public class QuotientAndRemainderDivision {
	public static void main(String[] args) {
		// знаковое частное
		// -1
		int divisionSignedMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;
		int divisionSignedMaxMin = Integer.MAX_VALUE / Integer.MIN_VALUE;

		// знаковый остаток
		// -1
		int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
		// 2147483647
		int moduloSignedMaxMin = Integer.MAX_VALUE % Integer.MIN_VALUE;

		System.out.println(divisionSignedMinMax);
		System.out.println(divisionSignedMaxMin);
		System.out.println(moduloSignedMinMax);
		System.out.println(moduloSignedMaxMin);


		// беззнаковое частное
		int divisionUnsignedMinMax = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE); // 1
		int divisionUnsignedMaxMin = Integer.divideUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE); // 0
		// беззнаковый остаток
		int moduloUnsignedMinMax = Integer.remainderUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE); // 1
		int moduloUnsignedMaxMin = Integer.remainderUnsigned(Integer.MAX_VALUE, Integer.MIN_VALUE); // 2147483647

		System.out.println(divisionUnsignedMinMax);
		System.out.println(divisionUnsignedMaxMin);
		System.out.println(moduloUnsignedMinMax);
		System.out.println(moduloUnsignedMaxMin);

	}
}
