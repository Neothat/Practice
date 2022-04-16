package ru.practice;

/**
 * Удаление пробелов из строки. Написать программу, которая удаляет все пробелы из заданной строки.
 */
public class RemovingSpacesFromString {

	private static final String STRING = "One Two Three";

	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces(STRING));
	}

	private static String removeWhiteSpaces(String str) {
		return str.replaceAll("\\s", "");
	}
}
