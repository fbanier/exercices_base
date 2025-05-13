package org.example;

import java.util.Arrays;

public class Exercice94 {
    public static void main(String[] args) {
        /*
        Exercice : 100 éléments
         */
        
        //1. Déclarer un tableau de 100 éléments et l'initialiser
        
        int[] centElem = new int[100];
        for (int i = 0; i <= 99; i++) {
            centElem[i] = i;
        }

        System.out.println(Arrays.toString(centElem));
        String result = "";
        
        // 2.Afficher les éléments par dizaine séparés d'une virgule


        System.out.println(result);
        
    }
}
