package org.example;

import java.util.Scanner;

public class Exercice51 {
    public static void main(String[] args) {
        /*
        Exercice : Prénom nom
         1.Créer une variable nom et une variable prenom
         2.Afficher la phrase suivante "Bonjour {prenom} {NOM}."
         3.Remplacer les valeurs entre chevrons par les variables crééesprécédemment
        * */

        String nom, prenom;
        nom = "BOND";
        prenom = "James";
        Scanner scn = new Scanner(System.in);
        System.out.println("Bonjour "+prenom +" "+ nom);
    }
}
