package ru.practice.Tasks20_29;

import java.util.function.BinaryOperator;

/**
 * Сложение двух крупных чисел типа int/long и переполнение операции.
 * Написать программу, которая складывает два крупных числа int/long
 * и выбрасывает арифметическое исключение в случае переполнения операции.
 */
public class AddingTwoLargeNumbers {
	public static void main(String[] args) {
		exactVar1();
		exactVar2();
	}

	private static void exactVar1() {
		Integer z = Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	private static void exactVar2() {
		BinaryOperator<Integer> operator = Math::addExact;
		int z = operator.apply(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}
}
