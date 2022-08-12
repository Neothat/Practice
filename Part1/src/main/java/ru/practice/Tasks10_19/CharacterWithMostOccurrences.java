package ru.practice.Tasks10_19;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Отыскание символа с наибольшим числом появлений.
 * Написать программу, которая отыскивает символ с наибольшим числом появлений в заданной строке.
 */
public class CharacterWithMostOccurrences {

	private static final String MY_STRING = "Java Python Ruby C Swift Kotlin PHP JavaScript";

	private static final int EXTENDED_ASCII_CODES = 256;

	public static void main(String[] args) {
		System.out.println(maxOccurrenceCharacterVar1(MY_STRING));
		System.out.println(maxOccurrenceCharacterVar2(MY_STRING));
		System.out.println(maxOccurrenceCharacterVar3(MY_STRING));
	}

	private static String maxOccurrenceCharacterVar1(String str) {
		Map<Character, Integer> counter = new HashMap<>();
		char[] chStr = str.toCharArray();
		for (int i = 0; i < chStr.length; i++) {
			char currentCh = chStr[i];
			if (!Character.isWhitespace(currentCh)) {
				Integer noCh = counter.get(currentCh);
				if (noCh == null) {
					counter.put(currentCh, 1);
				} else {
					counter.put(currentCh, ++noCh);
				}
			}
		}

		int maxOccurrences = Collections.max(counter.values());
		char maxCharacter = Character.MIN_VALUE;

		for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
			if (entry.getValue() == maxOccurrences) {
				maxCharacter = entry.getKey();
			}
		}

		return String.format("Символ %s повторился %d раз", maxCharacter, maxOccurrences);
	}

	private static String maxOccurrenceCharacterVar2(String str) {
		int maxOccurrences = -1;
		char maxCharacter = Character.MIN_VALUE;
		char[] chStr = str.toCharArray();
		int[] asciiCodes = new int[EXTENDED_ASCII_CODES];

		for (char currentCh : chStr) {
			if (!Character.isWhitespace(currentCh)) {
				int code = (int) currentCh;
				asciiCodes[code]++;
				if (asciiCodes[code] > maxOccurrences) {
					maxOccurrences = asciiCodes[code];
					maxCharacter = currentCh;
				}
			}
		}
		return String.format("Символ %s повторился %d раз", maxCharacter, maxOccurrences);
	}

	private static String maxOccurrenceCharacterVar3(String str) {
		return str.chars()
				.filter(c -> !Character.isWhitespace(c))
				.mapToObj(c -> (char) c)
				.collect(groupingBy(c -> c, counting()))
				.entrySet()
				.stream()
				.max(comparingByValue())
				.map(characterLongEntry -> String.format("Символ %s повторился %d раз", characterLongEntry.getKey(), characterLongEntry.getValue()))
				.get();
	}
}
