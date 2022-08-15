package ru.practice.Tasks10_19;

import java.util.regex.Pattern;

/**
 * Проверка наличия подстроки в строке.
 * Написать программу, которая проверяет, содержит ли заданная строка заданную подстроку.
 */
public class PresenceSubstring {
	private static final String TEXT = "Hello world!";
	private static final String SUBTEXT = "orl";

	public static void main(String[] args) {
		System.out.println(TEXT.contains(SUBTEXT));
		System.out.println((TEXT.indexOf(SUBTEXT)) != -1);
		System.out.println(TEXT.matches("(?i).*" + Pattern.quote(SUBTEXT) + ".*"));
	}
}
