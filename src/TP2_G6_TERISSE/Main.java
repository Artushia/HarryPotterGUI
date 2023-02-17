package TP2_G6_TERISSE;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(isBinarySumInArray2(new int[]{3, 5, 7, 15, 26, 31}, 33));
    }

    /*
    Retourne true si val est la somme de deux entiers du tableau sinon false
    complexité O(n^2) car 2 boucles imbriqués O(n) * O(n)
    */
    public static boolean isBinarySumInArray(int[] integers, int val) {
        for (int a = 0; a < (integers.length-1 ); a++) {
            for (int i = a+1; i < (integers.length); i++) {
                    int sum = integers[a] + integers[i];
                    System.out.println(integers[a] + " + " + integers[i] + " = " + sum);
                    if (sum == val) {
                        return true;
                    }
                }
            }
        return false;
    }

    /*
    Méthode plus complexe du prof de complexité O(n)
     */
    public static boolean isBinarySumInArray2(int[] integers, int val) {
        Set<Integer> set = new HashSet<>();
        for (int integer : integers) {
            if (set.contains(val - integer)) {
                return true;
            }
            set.add(integer);
            System.out.println(set);
        }
        return false;
    }
}
