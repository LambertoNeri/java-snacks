package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        //Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

        //creo lista nomi
        String[] names = {"Mario", "Franca", "Luigi", "Lamberto", "Ludovica", "Carmen", "Ilaria", "Pascal"};
        //creo lista cognomi
        String[] surnames = {"Blue", "Midgnight", "Neri", "Poretti", "De Ceglie", "Sirovich", "Collaudo", "Pincolo"};
        //Array lista falsa
        String[] fakeList = new String[8];
        //Importo e creo istanza Random
        Random rand = new Random();

        for(int i = 0; i < names.length; i++ ) {
            int num1 = rand.nextInt(0, 8);
            int num2 = rand.nextInt(0, 8);
            fakeList[i] = names[num1] + " " + surnames[num2];
        }
        System.out.println("beccate sta lista completamente randomica " + Arrays.toString(fakeList));
    }
}
