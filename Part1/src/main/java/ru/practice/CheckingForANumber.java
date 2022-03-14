package ru.practice;

public class CheckingForANumber {

    private static final String ORIGIN = "ajknsndbiojphajsdbvgu3";

    // Mine
//    public static void main(String[] args) {
//        boolean contentNumber = ORIGIN.chars()
//                .mapToObj(c -> (char) c)
//                .noneMatch(Character::isDigit);
//        System.out.println(contentNumber);
//    }

    // Var 1
//    public static void main(String[] args) {
//        for (int i = 0; i < ORIGIN.length(); i++) {
//            if (!Character.isDigit(ORIGIN.charAt(i))) {
//                System.out.println(false);
//            }
//        }
//        System.out.println(true);
//    }
    // Var 2
//    public static void main(String[] args) {
//        boolean contentNumber = ORIGIN.chars()
//                .anyMatch(Character::isDigit);
//    }

    public static void main(String[] args) {
        boolean contentNumber = ORIGIN.matches("[0-9]+");
    }
}
