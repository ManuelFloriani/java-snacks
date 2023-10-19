package org.lessons.java;


import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomiArray = {"Andrea", "Mario", "Luigi", "Denzel", "Tommaso", "Rebecca"};
        String[] cognomiArray = {"Rossi", "Idrico", "Super", "Washington", "Bianchi", "Totti"};
        Random rand = new Random();


        for (int i = 0; i < nomiArray.length; i++) {
            String randName = nomiArray[rand.nextInt(nomiArray.length)];
            String randSurname = cognomiArray[rand.nextInt(cognomiArray.length)];
            System.out.println(randName + " " + randSurname);
        }
    }
}
