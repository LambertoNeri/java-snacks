package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        //Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        //creo l'array contentente i numeri
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        //creo la variabile dove sommare i numeri in posizione dispari
        int sum = 0;

        for(int i = 1; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        System.out.println("la somma di tutti i numeri in posizione dispari è '" + sum + "'" );
    }
}
