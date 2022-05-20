package ru.practice.Tasks10_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Удаление повторяющихся символов.
 * Написать программу, которая удаляет повторяющиеся символы из заданной строки.
 */
public class RemovingDuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesVar1("RemovingDuplicateCharacters"));
        System.out.println(removeDuplicatesVar2("RemovingDuplicateCharacters"));
        System.out.println(removeDuplicatesVar3("RemovingDuplicateCharacters"));
    }

    public static String removeDuplicatesVar1(String str) {
        char[] chArray = str.toCharArray(); // или использовать charAt(i)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicatesVar2(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c : chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDuplicatesVar3(String str) {
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
