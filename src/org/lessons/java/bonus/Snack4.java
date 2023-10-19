package org.lessons.java.bonus;

public class Snack4 {
    public static void main(String[] args) {
        String stringa = "i topi non       avevano nipoti";
//        elimino gli spazi dalla stringa in maniera tale che le intere frasi se palindrome possono essere validate
        stringa = stringa.replaceAll("\\s", "");
        String palindrome = String.valueOf(new StringBuilder(stringa).reverse());
        if (stringa.equals(palindrome)){
            System.out.println("La stringa è palindroma");
        } else {
            System.out.println("La stringa non è palindroma");
        }


    }
}
