package org.example;

import java.util.Scanner;

public class Exercice82 {
    public static void main(String[] args) {
        /*
        Exercice : Sommes consécutives
         */

        //Déclarer une variable nombre
        int nbr;
        int som = 0;
        int som2 = 0;
        int cpt = 1;

        Scanner scn = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre : ");
        nbr = scn.nextInt();

        while(som != nbr){
            for (int i = 0; som2 <= nbr; i++){
                som2 = cpt + i;
                System.out.println(cpt + " + " + i + " = "+ som2);
            }
            som = som2;
            cpt++;
        }
    }
}
