package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numArray = {1, 10, 2, 10, 1, 10, 2, 10, 1, 10};
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
//            Per posizione dispari ho inteso quella "da programmatore" ovvero iniziando a contare gli             elementi di un array da indice 0
            if (i % 2 == 1){
                sum += numArray[i];

            }
        }
        System.out.println(sum);
    }
}
