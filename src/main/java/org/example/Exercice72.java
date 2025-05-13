package org.example;

import java.util.Scanner;

public class Exercice72 {
    public static void main(String[] args) {
        /*
        Exercice : Jour de la semaine
         */

        // Créer une variable jour de type entier
        int nbr = 0;

        // Affecter des valeurs aux variables
        Scanner scn = new Scanner(System.in);
        System.out.println("Saisir un nombre :");
        nbr = scn.nextInt();

        if(nbr < 1 || nbr > 7) nbr = 0;

        while (nbr < 1){
            System.out.println("Erreur : veuillez saisir un nombre entre 1 et 7 :");
            nbr = scn.nextInt();
            if (nbr > 7) nbr = 0;
        }

        String[] jours = {"", "Lundi", "Mardi", "Mercredi", "Vendredi", "Samedi", "Dimanche"};

        System.out.println(jours[nbr]);
    }
}
