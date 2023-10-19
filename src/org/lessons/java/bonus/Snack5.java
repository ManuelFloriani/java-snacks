package org.lessons.java.bonus;

import java.util.Scanner;
public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una numero: ");
        String userNumber = scan.nextLine();
        int number = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            // Assegno a digitChar il carattere di userNumber in posizione uguale al valore di i
            char digitChar = userNumber.charAt(i);
            // Sottraggo 0 per ottenere il valore numerico del carattere
            int digitValue = digitChar - '0';
            // Moltiplico per 10 per posizionare correttamente il numero
            number = number * 10 + digitValue;
        }
        System.out.println("Numero convertito: " + number);
        scan.close();
    }
}

