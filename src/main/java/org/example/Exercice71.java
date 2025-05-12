package org.example;

import java.util.Scanner;

public class Exercice71 {
    public static void main(String[] args) {
        /*
        Exercice : Voyelle ou consonne
         */
        // 1. Créer une variable caractere
        char character;
        String input;
        // 2. Affecter une valeur à la variable caractere
        Scanner scn = new Scanner(System.in);
        System.out.println("Saisir un caractère :");
        input = scn.nextLine().toLowerCase();
        character = input.charAt(0);

        // A l'aide des structures conditionnelles, déterminer si le caractère est une consonne ou une voyelle
        char[] voyelles = {'a', 'e', 'i', 'o', 'u', 'y'};
        boolean isVoyelle = false;

        for (char voyelle : voyelles) {
            if (voyelle == character) isVoyelle = true;
        }

        if(isVoyelle) System.out.println("C'est une voyelle");
        else System.out.println("C'est une consonne");
    }
}
