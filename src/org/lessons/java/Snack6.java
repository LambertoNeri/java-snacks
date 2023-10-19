package org.lessons.java;



public class Snack6 {
    public static void main(String[] args) {
        //Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

        int totSeconds = 5287;
        int hours = 0;
        int min =  totSeconds / 60;
        int secs = 0;




         if (min > 59 ) {
             while (min > 59) {
                 hours++;
                 min = min - 60;
                 if (min == 0) {
                     break;
                 }
             }
         }
        secs = totSeconds;

         while(secs > 59) {
             secs = secs - 60;
             if (secs == 0 ) {
                 break;
             }
         }


        System.out.println("Totale secondi: " +totSeconds+ ". questi secondi corrispondono a: " + hours + ":" + min + ":" + ((secs < 10) ? "0" +secs +" ore" : secs +" ore") );

    }
}
