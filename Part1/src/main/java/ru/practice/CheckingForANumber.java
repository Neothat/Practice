package ru.practice;

/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 */
public class CheckingForANumber {

    private static final String string1 = "ajknsndbiojphajsdbvgu3";
    private static final String string2 = "3345636";

    public static void main(String[] args) {
        System.out.println(containsOnlyDigitsVar1(string1));
        System.out.println(containsOnlyDigitsVar1(string2));
        System.out.println(containsOnlyDigitsVar2(string1));
        System.out.println(containsOnlyDigitsVar2(string2));
        System.out.println(containsOnlyDigitsVar3(string1));
        System.out.println(containsOnlyDigitsVar3(string2));
    }

    private static boolean containsOnlyDigitsVar1(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean containsOnlyDigitsVar2(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }

    private static boolean containsOnlyDigitsVar3(String str) {
        return str.matches("[0-9]+");
    }
}
