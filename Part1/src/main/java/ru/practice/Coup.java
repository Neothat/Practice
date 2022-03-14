package ru.practice;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Coup {
    private static final String ORIGIN = "One Two Three";
    private static final Pattern PATTERN = Pattern.compile(" +");

    // Mine
//    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = ORIGIN.length()-1; i >= 0; --i) {
//            stringBuilder.append(ORIGIN.charAt(i));
//        }
//        System.out.println(stringBuilder);
//    }

    // Var 1
//    public static void main(String[] args) {
//        System.out.println(
//                PATTERN.splitAsStream(ORIGIN)
//                        .map(w -> new StringBuilder(w).reverse())
//                        .collect(Collectors.joining(" "))
//        );
//    }

    public static void main(String[] args) {
        System.out.println(
                new StringBuilder(ORIGIN).reverse()
        );
    }
}
