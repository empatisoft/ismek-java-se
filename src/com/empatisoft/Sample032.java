package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample032 {
    public static void main(String[] args){
        // Diziler
        // Birden fazla değişken ya da nesnenin bir arada tutulması durumudur.
        // diziler tanımlanırken [] almak zorunludur.
        // dizi boyutu (kaç elemanlı) tanımlanırken belirlenmek zorundadır.
        // diziye değer ataması sırasında tanımlanmış türe uygun olarak hareket edilmelidir.
        // 2 şekilde dizi tanımı yapılmaktadır.
        // İlki;
        String dizi [] = new String[5];
        dizi[0] = "Ali";
        dizi[1] = "Veli";
        dizi[2] = "Ayşe";
        dizi[3] = "Fatma";
        dizi[4] = "Hayriye";
        System.out.println("1. Eleman Değeri: " + dizi[0]);

        // İkincisi;
        String[] dizi_2 = {"10", "20", "30"};
        System.out.println("Yeni dizi: " + dizi_2[0]);

        // Eleman sayısını bulma
        System.out.println("Dizi eleman sayısı: " + dizi_2.length);

        // Dizi elemanlarına erişim
        for (int i = 0; i < dizi_2.length; i++) {
            System.out.println("Eleman: " + dizi_2[i]);
        }

        Scanner oku = new Scanner(System.in);
        Scanner iste = new Scanner(System.in);
        System.out.println("Lütfen müşteri sayısını giriniz");
        int sayi = oku.nextInt();
        String kulDizi[] = new String[sayi];
        for (int j = 0; j < kulDizi.length; j++) {
            System.out.println("Lütfen " + j + ". müşteri adını giriniz:");
            kulDizi[j] = iste.nextLine();
        }

        for (String string:kulDizi) {
            System.out.println(string);
        }
        oku.close();
        iste.close();


    }
}
