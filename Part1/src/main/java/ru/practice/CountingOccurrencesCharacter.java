package ru.practice;

/**
 * Подсчет появлений некоторого символа. Написать программу,
 * которая подсчитывает появления того или иного символа в заданной строке.
 */
public class CountingOccurrencesCharacter {

	private static final String string = "adjust chess come to life deontology muddy obiing recruit slink";

	public static void main(String[] args) {
		System.out.println(countOccurrencesOfACertainCharacterVar1(string, 'e'));
		System.out.println(countOccurrencesOfACertainCharacterVar2(string, "e"));
		System.out.println(countOccurrencesOfACertainCharacterVar3(string, 'e'));
		System.out.println(countOccurrencesOfACertainCharacterVar4(string, 'e'));
	}

	public static int countOccurrencesOfACertainCharacterVar1(String str, char ch) {
		return str.length() - str.replace(String.valueOf(ch), "").length();
	}

	public static int countOccurrencesOfACertainCharacterVar2(String str, String ch) {
		if (ch.codePointCount(0, ch.length()) > 1) {
// 			в заданном значении типа String более одного юникодового символа
			return -1;
		}
		int result = str.length() - str.replace(ch, "").length();

// 		если ch.length() возвращает 2, то это является юникодовой суррогатной парой
		return ch.length() == 2 ? result / 2 : result;
	}

	public static int countOccurrencesOfACertainCharacterVar3(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static long countOccurrencesOfACertainCharacterVar4(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}
