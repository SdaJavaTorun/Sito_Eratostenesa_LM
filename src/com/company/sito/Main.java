package com.company.sito;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, zakres, koniec_zakresu;
        int tablica[] = new int[1000];

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj gorny zakres, do ktorego chcesz odnalezc liczby pierwsze: ");
        zakres = in.nextInt();

        koniec_zakresu = (int) Math.floor(Math.sqrt(zakres));
        //inicjuj tablice
        for (a=1; a<=zakres; a++) tablica[a]=a;
        //algorytm - sito eratostenesa
        for (a=2; a<=koniec_zakresu; a++) {
            if (tablica[a] != 0) {
                b = a + a;
                while (b<=zakres) {
                    tablica[b] = 0;
                    b += a;
                }
            }
        }
        //wypisz wynik
        System.out.println("Liczby pierwsze z zakresu od 1 do " + zakres);
        for (a=2; a<=zakres; a++)
            if (tablica[a]!=0)
                System.out.print(a + ", ");
    }
}