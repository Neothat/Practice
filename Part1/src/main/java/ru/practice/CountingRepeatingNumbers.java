package ru.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingRepeatingNumbers {
    private static final String ORIGIN = "qwer qwer qw qw qw qw qw qq gg gg AA AA AA";

    // Mine
//    public static void main(String[] args) {
//        char symbols[] = ORIGIN.toCharArray();
//        Map<Character, Integer> map = new HashMap();
//        for (char s : symbols) {
//            if (map.containsKey(s)) {
//                map.replace(s, map.get(s) + 1);
//            } else {
//                map.put(s, 1);
//            }
//        }
//        System.out.println(map);
//    }

    // Var1
//    public static void main(String[] args) {
//        Map<Character, Integer> map = new HashMap<>();
//
////        for (int i = 0; i < ORIGIN.length(); i++) {
////            char ch = ORIGIN.charAt(i);
////
////            map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
////        }
//
//        IntStream.range(0, ORIGIN.length()).forEach(i -> {
//            char ch = ORIGIN.charAt(i);
//            map.compute(ch, (k, v) -> v == null ? 1 : ++v);
//        });
//
//        System.out.println(map);
//    }

    // Var1.1
//    public static void main(String[] args) {
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < ORIGIN.length(); i++) {
//            int cp = ORIGIN.codePointAt(i);
//            String ch = String.valueOf(Character.toChars(cp));
//            if (Character.charCount(cp) == 2) { // 2 Означает суррогатную пару
//                i++;
//            }
//            map.compute(ch, (k, v) -> v == null ? 1 : ++v);
//        }
//        System.out.println(map);
//    }

//    // Var2
//    public static void main(String[] args) {
//        Map<Character, Long> map = ORIGIN.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        System.out.println(map);
//    }

    public static void main(String[] args) {
        Map<String, Long> map = ORIGIN.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map);
    }
}
