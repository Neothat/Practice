package ru.practice;

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
}
