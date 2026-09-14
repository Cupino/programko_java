package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean x = true;
        Scanner scanner = new Scanner(System.in);

        while (x) {
            System.out.println("Zadaj cislo a:");
            int a = scanner.nextInt();

            System.out.println("Zadaj cislo b:");
            int b = scanner.nextInt();

            System.out.println("Chces cisla scitat (+), odcitat (-), nasobit (*) alebo delit (/)?");
            String operacia = scanner.next();

            vypocet(a, b, operacia);

            scanner.nextLine();

            System.out.printf("Zastavit?");
            String odpoved = scanner.nextLine();
            if (odpoved.equals("ano")) {
                x = false;
            }
        }
    }

    public static int scitaj(int a, int b) {
        return a + b;
    }

    public static int odcitaj(int a, int b) {
        return a - b;
    }

    public static int nasob(int a, int b) {
        return a * b;
    }

    public static int del(int a, int b) {
        return a / b;
    }

    public static void vypocet(int a, int b, String operacia) {
        if (operacia.equals("+")) {
            System.out.println("Vysledok je: " + scitaj(a, b));
        }
        else if (operacia.equals("-")) {
            System.out.println("Vysledok je: " + odcitaj(a, b));
        }
        else if (operacia.equals("*")) {
            System.out.println("Vysledok je: " + nasob(a, b));
        }
        else if (operacia.equals("/")) {
            if (b == 0) {
                System.out.println("Chyba: Nulou sa neda delit!!");
            } else {
                System.out.println("Vysledok je: " + del(a, b));
            }
        }
        else {
            System.out.println("Neplatna operacia!");
        }
    }
}