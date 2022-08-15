package ru.practice.Tasks10_19;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Locale;

/**
 * Проверка, являются ли две строки анаграммами.
 * Написать программу, которая проверяет, являются ли две строки анаграммами.
 * Учесть, что анаграммой строки является строка, образованная перестановкой букв в обратном порядке
 * с игнорированием заглавных букв и пробелов.
 */
public class Anagrams {

	private static final int EXTENDED_ASCII_CODES = 256;

	private static final String FIRSTSTRING = "H e llo";
	private static final String SECONDSTRING = "oehLL";

	public static void main(String[] args) {
		System.out.println(isAnagramsVar1(FIRSTSTRING, SECONDSTRING));
		System.out.println(isAnagramsVar2(FIRSTSTRING, SECONDSTRING));
	}

	private static boolean isAnagramsVar1(String str1, String str2) {
		char[] anagram1 = str1.toLowerCase(Locale.ROOT).replaceAll("\\s", StringUtils.EMPTY).toCharArray();
		char[] anagram2 = str2.toLowerCase(Locale.ROOT).replaceAll("\\s", StringUtils.EMPTY).toCharArray();

		Arrays.sort(anagram1);
		Arrays.sort(anagram2);

		return Arrays.equals(anagram1, anagram2);
	}

	private static boolean isAnagramsVar2(String str1, String str2) {
		int[] chCounts = new int[EXTENDED_ASCII_CODES];
		char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

		if (chStr1.length != chStr2.length) {
			return false;
		}
		for (int i = 0; i < chStr1.length; i++) {
			chCounts[chStr1[i]]++;
			chCounts[chStr2[i]]--;
		}
		for (int chCount : chCounts) {
			if (chCount != 0) {
				return false;
			}
		}
		return true;
	}
}
