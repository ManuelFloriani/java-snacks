package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in);
        System.out.println("Inserisci un numero: se pari lo stamperò, se dispari stamperò il numero pari successivo. Terminerò l'esecuzione quando inserirai un numero negativo. ");
        int userNumber = numScan.nextInt();
        while (userNumber > 0){
            if (userNumber % 2 == 0) {
                System.out.println(userNumber);
            } else {
                System.out.println(userNumber + 1);
            }
            System.out.println("Inserisci un altro numero: ");
            userNumber = numScan.nextInt();
        }

        numScan.close();
    }
}
