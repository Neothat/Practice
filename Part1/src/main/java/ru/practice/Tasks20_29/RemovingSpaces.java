package ru.practice.Tasks20_29;

/**
 * Удаление начальных и замыкающих пробелов.
 * Написать программу, которая удаляет начальные и замыкающие пробелы заданной строки.
 */
public class RemovingSpaces {
	private static final String TEXT = "\n \n\n hello \t \n \r";
	private static final String TRIMMED = TEXT.trim();
//	JDK 11
//	private static final String TRIMMED = TEXT.strip();

	public static void main(String[] args) {
		System.out.println(TRIMMED);
	}
}
