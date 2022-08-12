package ru.practice.Tasks10_19;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Удаление заданного символа.
 * Написать программу, которая удаляет заданный символ из заданной строки.
 */
public class DeletingGivenCharacter {

	private static final String MY_STRING = "Java Python Ruby C Swift Kotlin PHP JavaScript";
	private static final char SYMBOL = 't';
	private static final String SYMBOLL = "t";

	public static void main(String[] args) {
		System.out.println(removeCharacterVar1(MY_STRING, SYMBOL));
		System.out.println(removeCharacterVar2(MY_STRING, SYMBOL));
		System.out.println(removeCharacterVar3(MY_STRING, SYMBOL));
		System.out.println(removeCharacterVar4(MY_STRING, SYMBOLL));
	}

	// Метод Pattern.quote()
	// Это необходимо для экранирования специальных символов, таких как
	// <, (,[,{, \, ^, -, =, $, !, |, ], }, ), ?, *, +, . и >.
	private static String removeCharacterVar1(String str, char ch) {
		return str.replaceAll(Pattern.quote(String.valueOf(ch)), StringUtils.EMPTY);
	}

	private static String removeCharacterVar2(String str, char ch) {
		StringBuilder sb = new StringBuilder();
		char[] chArray = str.toCharArray();

		for (char c : chArray) {
			if (c != ch) {
				sb.append(c);
			}
		}

		return sb.toString();
	}

	private static String removeCharacterVar3(String str, char ch) {
		return str.chars()
				.filter(c -> c != ch)
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
	}

	private static String removeCharacterVar4(String str, String ch) {
		int codePoint = ch.codePointAt(0);

		return str.codePoints()
				.filter(c -> c != codePoint)
				.mapToObj(c -> String.valueOf(Character.toChars(c)))
				.collect(Collectors.joining());
	}

}
