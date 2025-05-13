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
        while (input.length() > 1){
            System.out.println("Erreur, veuillez saisir un caractère unique :");
            input = scn.nextLine().toLowerCase();
        }
        character = input.charAt(0);

        boolean isVoyelle = false;

        if((character == 'a') || (character == 'e') || (character == 'i') || (character == '0' || (character == 'u') || (character == 'y'))){
            isVoyelle = true;
        }

        if(isVoyelle) System.out.println("C'est une voyelle");
        else System.out.println("C'est une consonne");
    }
}
