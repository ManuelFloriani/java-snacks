package org.lessons.java.bonus;

public class Snack6 {
    public static void main(String[] args) {
        int totalSeconds = 59959; // Sostituisci con il numero di secondi da convertire

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println("Tempo convertito: " + timeString);
    }
}
