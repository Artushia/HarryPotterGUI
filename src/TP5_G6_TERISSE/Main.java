package TP5_G6_TERISSE;

public class Main {

    public static void main(String[] args) {
        System.out.println(isInOrder("abc"));
        System.out.println(isInOrder("agis"));
    }

    public static boolean isInOrder(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}