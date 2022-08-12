package ru.practice.Tasks10_19;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Соединение нескольких строк с помощью разделителя.
 * Написать программу, которая соединяет заданные строки с помощью заданного разделителя.
 */
public class JoiningStrings {

	private static final char DELIMITER = '-';

	public static void main(String[] args) {
		System.out.println(joinByDelimiterVar1(DELIMITER, "123", "234", "qwerty"));
		System.out.println(joinByDelimiterVar2(DELIMITER, "123", "234", "qwerty"));
		System.out.println(joinByDelimiterVar3(DELIMITER, "123", "234", "qwerty"));

		String.join(String.valueOf(DELIMITER), "123", "234", "qwerty");
	}

	private static String joinByDelimiterVar1(char delimiter, String... args) {
		StringBuilder result = new StringBuilder();
		int i = 0;
		for (; i < args.length - 1; i++) {
			result.append(args[i]).append(delimiter);
		}
		result.append(args[i]);
		return result.toString();
	}

	private static String joinByDelimiterVar2(char delimiter, String... args) {
		StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

		for (String arg : args) {
			joiner.add(arg);
		}
		return joiner.toString();
	}

	private static String joinByDelimiterVar3(char delimiter, String... args) {
		return Arrays.stream(args, 0, args.length).collect(Collectors.joining(String.valueOf(delimiter)));
	}
}
