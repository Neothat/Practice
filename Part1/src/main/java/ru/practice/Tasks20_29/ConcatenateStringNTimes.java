package ru.practice.Tasks20_29;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Конкатенирование одной и той же строки п раз.
 * Написать программу, которая конкатенирует одну и ту же строку заданное число раз.
 */
public class ConcatenateStringNTimes {

	private static final String TEXT = "QWERTY";

	public static void main(String[] args) {
		System.out.println(concatRepeatVar1(TEXT, 2));
		System.out.println(concatRepeatVar2(TEXT, 2));
		System.out.println(concatRepeatVar3(TEXT, 2));
		System.out.println(concatRepeatVar4(TEXT, 2));
		System.out.println(concatRepeatVar5(TEXT, 2));
	}

	private static String concatRepeatVar1(String str, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

//	private static String concatRepeatVar2(String str, int n) {
//		JDK 11
//		return str.repeat(n);
//	}

	private static String concatRepeatVar2(String str, int n) {
		return String.join("", Collections.nCopies(n, str));
	}

	private static String concatRepeatVar3(String str, int n) {
		return Stream.generate(() -> str)
				.limit(n)
				.collect(Collectors.joining());
	}

	private static String concatRepeatVar4(String str, int n) {
		return String.format("%0" + n + "d", 0)
				.replace("0", str);
	}

	private static String concatRepeatVar5(String str, int n) {
		return new String(new char[n]).replace ("\0", str);
	}
}
