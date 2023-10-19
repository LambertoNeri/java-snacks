package org.lessons.java;

public class Snack5 {
    public static void main(String[] args) {
        //Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        //Possibile usare solo :
        //cicli
        //chartAt
        //if / switch
        //Es. “25" come stringa deve essere convertito in intero 25.

        String str = "25";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            char charNum = str.charAt(i);
            int convNum = charNum - '0';
            num = num * 10 + convNum;
        }
        System.out.println(num);

    }
}
