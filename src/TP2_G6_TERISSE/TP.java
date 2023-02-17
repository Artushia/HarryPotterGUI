package TP2_G6_TERISSE;

import java.util.Scanner;

public class TP {

    public static void main(String[] args) {
        discriminant();
        //parite();
        //max();
    }

    public static void discriminant() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        float b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2)- 4 * a * c);
        float r0 = (-b)/(2*a) ;
        if (delta < 0) {
            float r3 = (float) ((Math.sqrt(-delta))/2*a);
            float r4 = (float) ((Math.sqrt(-delta))/2*a);
            System.out.println("Ce polynome n’a pas de racine reelle");
            System.out.println("Les deux racines complexes sont r1 = " + r0 + " + i" + r3 + " et r2 = " + r0 + " - i" + r4);
        } else if (delta == 0) {
            System.out.println("Ce polynome a une racine r0 = " + r0);
        } else if (delta > 0) {
            float r1 = (float) ((-b+Math.sqrt(delta))/2*a);
            float r2 = (float) ((-b-Math.sqrt(delta))/2*a);
            System.out.println("Ce polynome a 2 racines réelles r1 = " + r1 + " et r2 = " + r2);
        }
    }

    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int nb = scanner.nextInt();
        if (nb%2 == 0) {
            System.out.println("Le chiffre " + nb + " est pair.");
        } else {
            System.out.println("Le chiffre " + nb + " est impair.");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int nb1 = scanner.nextInt();
        System.out.println("Saisissez un autre entier : ");
        int nb2 = scanner.nextInt();
        int max = Math.max(nb1, nb2);
        System.out.println("Le maximum est " + max);
        int min = Math.min(nb1, nb2);
        System.out.println("Le minimum est " + min);
    }

}
