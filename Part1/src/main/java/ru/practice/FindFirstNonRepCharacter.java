package ru.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepCharacter {

    private static final String ORIGIN = "qweqweqweweuwer";
    private static final int EXTENDED_ASCII_CODES = 256;

//    I don't know how to do it better
//    public static void main(String[] args) {
//        Map<Character, Long> map = ORIGIN.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//        map.keySet().forEach(key -> {
//            if (map.get(key) != 1L) {
//                map.remove(key);
//            }
//        });
//        int firstChar = Integer.MAX_VALUE;
//    }

    // Var 1
//    public static void main(String[] args) {
//        int[] flags = new int[EXTENDED_ASCII_CODES];
//
//        Arrays.fill(flags, -1);
//
//        for (int i = 0; i < ORIGIN.length(); i++) {
//            char ch = ORIGIN.charAt(i);
//            if (flags[ch] == -1) {
//                flags[ch] = i;
//            } else {
//                flags[ch] = -2;
//            }
//        }
//
//        int position = Integer.MAX_VALUE;
//
//        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
//            if (flags[i] >= 0) {
//                position = Math.min(position, flags[i]);
//            }
//        }
//
//        System.out.println(position == Integer.MAX_VALUE ? Character.MIN_VALUE : ORIGIN.charAt(position));
//    }

    // Var 2
//    public static void main(String[] args) {
//        Map<Character, Integer> chars = new LinkedHashMap<>();
//
//        for (int i = 0; i < ORIGIN.length(); i++) {
//            char ch = ORIGIN.charAt(i);
//
//            chars.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
//        }
//
//        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
//            if (entry.getValue() == 1) {
//                System.out.println(entry.getKey());
//                return;
//            }
//        }
//
//        System.out.println(Character.MIN_VALUE);
//    }

    // Var 3
    public static void main(String[] args) {
        Map<Integer, Long> chs = ORIGIN.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        System.out.println(String.valueOf(Character.toChars(cp)));
    }
}
