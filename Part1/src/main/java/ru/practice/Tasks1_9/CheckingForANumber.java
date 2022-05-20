package ru.practice.Tasks1_9;

/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры.
 */
public class CheckingForANumber {

    public static void main(String[] args) {

        final String string1 = "ajknsndbiojphajsdbvgu3";
        final String string2 = "3345636";

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
