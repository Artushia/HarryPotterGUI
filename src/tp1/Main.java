package tp1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //somme();
        //division();
        //volume();
        test();

        /*Cours 4 et 4.1

        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt(); //gets value from user
        float unReel = scanner.nextFloat(); //gets value from user
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);*/

        /*System.out.println("Bonjour, quel est votre prénom ?");
        String name = scanner.nextLine();
        System.out.println("Bonjour, " + name);*/

    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + "est egale a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La divsion de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la hauteur");
        float h = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float la = scanner.nextFloat();
        System.out.println("Veuillez saisir la longueur");
        float lo = scanner.nextFloat();
        float vol = h*la*lo;
        System.out.println("Le volume du pavé est: " + vol);
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier"); // On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation"); // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se retrouver dans la variable operation. Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();
        System.out.println(entier + operation);
    }
}