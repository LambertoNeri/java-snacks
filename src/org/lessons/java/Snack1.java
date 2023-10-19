package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        //Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
        //Se il numero è negativo termina.

        //importo scanner e creo classe scan
        Scanner scan = new Scanner(System.in);
        //creo variabile per storare il numero richiesto al guest
        int num;
        //booleano per chiudere rompere il programma
        boolean breaker = false;

        //creo il ciclo while per eseguire la richiesta
        while(!breaker) {
            //chiedo all'utente di inserire un numero
            System.out.println("Perfavore inserisci un numero se il numero inserito sarà dispari esso verrà corretto in pari, la richiesta si fermerà solo se il numero inserito è negativo");
            num = scan.nextInt();
            if(num < 0 ) {
                System.out.println("ti sei permesso di inserire un numero negativo?! Buonanotte...");
                //attivo il breaker
                breaker = true;
            } else {
                if( num % 2 == 0 ) {
                    System.out.println("il numero inserito è pari, sai mi piaci sempre di piu... " + num );
//                } else if (num == 0) {
//                    System.out.println("il numero inserito è zero" );
                } else {
                    System.out.println("il numero inserito è: " + num + "!! e "+num+" è un numero dispari, correggo subito..."+ (num + 1));
                }
            }
        }


        //chiudo lo scanner
        scan.close();
    }
}
