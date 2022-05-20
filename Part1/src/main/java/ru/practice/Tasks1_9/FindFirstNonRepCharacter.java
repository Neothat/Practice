package ru.practice.Tasks1_9;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 **/

public class FindFirstNonRepCharacter {

    private static final int EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {
        final String string = "qweqweqweweuwer";

        System.out.println(firstNonRepeatedCharacterVar1(string));
        System.out.println(firstNonRepeatedCharacterVar2(string));
        System.out.println(firstNonRepeatedCharacterVar3(string));
    }

    private static char firstNonRepeatedCharacterVar1(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

//        for (int i = 0; i < flags.length; i++) {
//            flags[i] = -1;
//        }

        Arrays.fill(flags, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    private static char firstNonRepeatedCharacterVar2(String str) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//        }

        for (char ch : str.toCharArray()) {
            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    private static String firstNonRepeatedCharacterVar3(String str) {
        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return String.valueOf(Character.toChars(cp));
    }
}
