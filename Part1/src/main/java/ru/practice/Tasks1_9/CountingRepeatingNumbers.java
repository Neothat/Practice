package ru.practice.Tasks1_9;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 **/

public class CountingRepeatingNumbers {

    public static void main(String[] args) {
        final String string = "qwer qwer qw qw qw qw qw qq gg gg AA AA AA";

        System.out.println(countDuplicateCharactersVar1(string));
        System.out.println(countDuplicateCharactersVar2(string));
        System.out.println(countDuplicateCharactersVar1_1(string));
        System.out.println(countDuplicateCharactersVar2_1(string));
    }

    private static Map<Character, Integer> countDuplicateCharactersVar1(String str) {
        Map<Character, Integer> result = new HashMap<>();

//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//        }

        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    private static Map<Character, Long> countDuplicateCharactersVar2(String str) {

//        Map<Character, Long> result = str.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        return result;

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    /**
     * Методы с поддержкой ASCII и Юникода
     **/

    private static Map<String, Integer> countDuplicateCharactersVar1_1(String str) {
        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

//            int cp = str.codePointAt(i);
//            String ch = String.valueOf(Character.toChars(cp));
//            if (Character.charCount(cp) == 2) { // 2 означает суррогатную пару
//                i++;
//            }

            String ch = String.valueOf(Character.toChars(str.codePointAt(i)));
            if (i < str.length() - 1 && str.codePointCount(i, i + 2) == 1) {
                i++;
            }

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    private static Map<String, Long> countDuplicateCharactersVar2_1(String str) {

//        Map <String, Long> result = str.codePoints()
//                .mapToObj(c -> String.valueOf(Character.toChars(c)))
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        return result;

        return str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
