package ru.practice.Tasks20_29;

import java.util.function.BinaryOperator;

/**
 * Вычисление минимума и максимума двух чисел.
 * Написать программу, которая возвращает минимум и максимум двух чисел.
 */
public class MinMax {
	public static void main(String[] args) {
		int i1 = -45;
		int i2 = -15;
		int min = Math.min(i1, i2);
		int max = Math.max(i1, i2);
		System.out.println(String.format("%d %d", min, max));

		double d1 = 0.023844D;
		double d2 = 0.35468856D;
		double min1 = Double.min(d1, d2);
		double max1 = Double.max(d1, d2);
		System.out.println(String.format("%4.3f %4.3f", min1, max1));

		float f1 = 33.34F;
		final float f2 = 33.213F;
		float min2 = BinaryOperator.minBy(Float::compare).apply(f1, f2);
		float max2 = BinaryOperator.maxBy(Float::compare).apply(f1, f2);
		System.out.println(String.format("%4.3f %4.3f", min2, max2));
	}
}
