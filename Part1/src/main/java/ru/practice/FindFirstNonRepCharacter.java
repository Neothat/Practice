package ru.practice;

import java.util.Arrays;

/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке.
 **/

public class FindFirstNonRepCharacter {

    private static final int EXTENDED_ASCII_CODES = 256;

    public static void main(String[] args) {
        final String string = "qweqweqweweuwer";

        System.out.println(firstNonRepeatedCharacterVar1(string));
        firstNonRepeatedCharacterVar2(string);
        firstNonRepeatedCharacterVar3(string);
    }

    // Один обход
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

    private static void firstNonRepeatedCharacterVar2(String string) {
    }

    private static void firstNonRepeatedCharacterVar3(String string) {
    }
}
