package ru.practice.Tasks10_19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Подсчет числа появлений подстроки в строке.
 * Написать программу, которая подсчитывает число появлений заданной строки в другой заданной строке.
 */
public class CountOccurrencesSubstringInString {

	private static final String ORIGINAL = "qwerqwerwqerqwe";
	private static final String FIND = "qwer";

	public static void main(String[] args) {
		System.out.println(countStringInStringVar1(ORIGINAL, FIND));
		System.out.println(countStringInStringVar2(ORIGINAL, FIND));
		System.out.println(countStringInStringVar3(ORIGINAL, FIND));
	}

	private static int countStringInStringVar1(String string, String toFind) {
		int position = 0;
		int count = 0;
		int n = toFind.length();

		while ((position = string.indexOf(toFind, position)) != -1) {
			position = position + n;
			count++;
		}
		return count;
	}

	private static int countStringInStringVar2(String string, String toFind) {
		int result = string.split(Pattern.quote(toFind), -1).length - 1;
		return Math.max(result, 0);
	}

	private static int countStringInStringVar3(String string, String toFind) {
		Pattern pattern = Pattern.compile(Pattern.quote(toFind));
		Matcher matcher = pattern.matcher(string);

		int position = 0;
		int count = 0;

		while (matcher.find(position)) {
			position = matcher.start() + 1;
			count++;
		}
		return count;
	}
}
