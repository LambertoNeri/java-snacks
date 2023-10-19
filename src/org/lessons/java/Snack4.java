package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        //Data in input una stringa verificare se è palindroma

        //creo ed importo classe scanner
        Scanner scan = new Scanner(System.in);

        //chiedo l'inserimento di una parola e la salvo in variabile "word"
        System.out.println("inserisci una parola, controlleremo assieme se è palindroma");
       String word = scan.nextLine();

       StringBuilder wordrev = new StringBuilder();
        //controllo se la parola è palindroma
        for (int i = word.length() - 1; i >= 0; i--) {
            wordrev.append(word.charAt(i));
        }

        if (wordrev.toString().equals(word)) {
            System.out.println("la stringa '" + word + "' è palindroma!!");
        } else {
            System.out.println("La stringa '" + word + "' non è palindroma");
        }
    }
}
