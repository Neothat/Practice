package ru.practice.Tasks1_9;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Подсчет гласных и согласных.
 * Написать программу, которая подсчитывает число гласных и согласных букв в заданной строке.
 * Сделать это для английского языка, который имеет пять гласных (а, е, /, о и и).
 */
public class CountingVowelsAndConsonants {

	private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

	public static void main(String[] args) {
		final String string = "qwertyuiopoiuytrewsdfghjlkjbvcxzxcvbnr";
		System.out.println(countVowelsAndConsonantsVar1(string));
		System.out.println(countVowelsAndConsonantsVar2(string));
		System.out.println(countVowelsAndConsonantsVar3(string));
	}

	private static Pair<Integer, Integer> countVowelsAndConsonantsVar1(String str) {
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (allVowels.contains(ch)) {
				vowels++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants++;
			}
		}
		return Pair.of(vowels, consonants);
	}

	private static Pair<Long, Long> countVowelsAndConsonantsVar2(String str) {
		str = str.toLowerCase();

		long vowels = str.chars()
				.filter(c -> allVowels.contains((char) c))
				.count();

		long consonants = str.chars()
				.filter(c -> !allVowels.contains((char) c))
				.filter(ch -> ch >= 'a' && ch <= 'z')
				.count();

		return Pair.of(vowels, consonants);
	}

	private static Pair<Long, Long> countVowelsAndConsonantsVar3(String str) {
		Map<Boolean, Long> result = str.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> (ch >= 'a' && ch <= 'z'))
				.collect(Collectors.partitioningBy(allVowels::contains, Collectors.counting()));

		return Pair.of(result.get(true), result.get(false));
	}
}
