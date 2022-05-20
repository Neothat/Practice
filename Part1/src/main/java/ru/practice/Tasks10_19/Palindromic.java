package ru.practice.Tasks10_19;

import java.util.stream.IntStream;

/**
 * Проверка, что строка является палиндромом.
 * Написать программу, которая выясняет, является ли данная строка палиндромом или нет.
 */
public class Palindromic {

    public static void main(String[] args) {
        System.out.println(isPalindromeVar1("madam"));
        System.out.println(isPalindromeVar1("madame"));

        System.out.println(isPalindromeVar2("madam"));
        System.out.println(isPalindromeVar2("madame"));

        System.out.println(isPalindromeVar3("madam"));
        System.out.println(isPalindromeVar3("madame"));

        System.out.println(isPalindromeVar4("madam"));
        System.out.println(isPalindromeVar4("madame"));
    }

    public static boolean isPalindromeVar1(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeVar2(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeVar3(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindromeVar4(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) !=
                        str.charAt(str.length() - p - 1));
    }
}