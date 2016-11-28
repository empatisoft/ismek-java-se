package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 24.11.2016.
 */
public class Exam1 {
    public static void main(String[] args) {

        /**
         * Soru: Aynı firmada çalışan (Ahmet ve Hasan) iki işçiden birincisinin (Ahmet) aylık ücreti bir ay %50 artmakta, sonraki ay %25 azalmaktadır. Diğerinin (Hasan) ise ücreti her ay %25 artmaktadır. Her ikisinin de yılbaşındaki başlangıç ücretleri ve hesaplanacak ay bilgisi klavyeden girildikten sonra ay ay ücretlerinin ne olacağını ve en sonunda hangi işçiden daha fazla (veya eşit) ücret alacağını hesaplayan programı yazınız.
         *
         * ÇIKTISI

         Lütfen Ahmet'in maaşını yazınız.
         1000
         Lütfen Hasan'ın maaşını yazınız.
         1000
         Lütfen ay bilgisini giriniz
         6
         Ahmet'in 1. aydaki maaşı = 1500 TL
         Ahmet'in 2. aydaki maaşı = 1125 TL
         Ahmet'in 3. aydaki maaşı = 1688 TL
         Ahmet'in 4. aydaki maaşı = 1266 TL
         Ahmet'in 5. aydaki maaşı = 1898 TL
         Ahmet'in 6. aydaki maaşı = 1424 TL

         Hasan'ın 1. aydaki maaşı = 1250 TL
         Hasan'ın 2. aydaki maaşı = 1563 TL
         Hasan'ın 3. aydaki maaşı = 1953 TL
         Hasan'ın 4. aydaki maaşı = 2441 TL
         Hasan'ın 5. aydaki maaşı = 3052 TL
         Hasan'ın 6. aydaki maaşı = 3815 TL

         Hasan'ın maaşı, Ahmet'in maaşından 2391.0 TL daha fazladır.
         */

        double maas_ahmet = 0;
        double maas_hasan = 0;
        double maas_farki = 0;
        int ay = 0;

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen Ahmet'in maaşını yazınız.");
        maas_ahmet = klavye.nextDouble();

        System.out.println("Lütfen Hasan'ın maaşını yazınız.");
        maas_hasan = klavye.nextDouble();

        System.out.println("Lütfen ay bilgisini giriniz");
        ay = klavye.nextInt();

        String txt_maas_ahmet = "";
        String txt_maas_hasan = "";
        String txt_maas_farki = "";

        for (int i = 1; i <= ay; i++) {
            if( i % 2 == 0) {
                maas_ahmet -= (maas_ahmet * 25) / 100 ;
                txt_maas_ahmet += "Ahmet'in " + i + ". aydaki maaşı = " + Math.round(maas_ahmet) + " TL\n";
            } else {
                maas_ahmet += (maas_ahmet * 50) / 100 ;
                txt_maas_ahmet += "Ahmet'in " + i + ". aydaki maaşı = " + Math.round(maas_ahmet) + " TL\n";
            }

            maas_hasan += (maas_hasan * 25) / 100 ;
            txt_maas_hasan += "Hasan'ın " + i + ". aydaki maaşı = " + Math.round(maas_hasan) + " TL\n";
        }

        if( maas_ahmet < maas_hasan) {
            maas_farki = Math.round(maas_hasan - maas_ahmet);
            txt_maas_farki = "Hasan'ın maaşı, Ahmet'in maaşından " + maas_farki + " TL daha fazladır.";
        } else if( maas_ahmet > maas_hasan) {
            maas_farki = Math.round(maas_ahmet - maas_hasan);
            txt_maas_farki = "Ahmet'in maaşı, Hasan'ın maaşından " + maas_farki + " TL daha fazladır.";
        } else if( maas_ahmet == maas_hasan) {
            txt_maas_farki = "Ahmet'in maaşı, Hasan'ın maaşına eşittir.";
        }

        System.out.println(txt_maas_ahmet);
        System.out.println(txt_maas_hasan);
        System.out.println(txt_maas_farki);
    }
}
