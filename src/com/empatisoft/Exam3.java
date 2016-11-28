package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 24.11.2016.
 */
public class Exam3 {
    public static void main(String[] args) {
        /**
         * SORU
         * Bir otoparkta park eden taksinin 1 saati 5 TL, minbüsün 1 saati 6 TL, ticari aracın 1 saati 6.5 TL dir. Taksi 1 saatten sonraki her saat başı için % 20 daha fazla, minibüs 1 saatten sonraki her saat başı için toplamda % 21,5 ve ticari araç 1 saatten sonraki her saat başı için toplamda %25 daha fazla ödeme yapmaktadır. Buna göre klavyeden girilen araba tipi ve kalınan saat bilgisi alındıktan sonra ekrana ödenecek otopark ücretini hesaplayan programı yazınız.
         *
         * ÇIKTISI
         *
         Lütfen araç tipini seçiniz:
         1: Taksi
         2: Minibüs
         3: Ticari Araç
         3
         Lütfen kalınan saat bilgisini giriniz.
         5
         Ödenecek tutar: 41 TL
         */

        double taksiUcreti = 5.00;
        double minibusUcreti = 6.00;
        double ticariAracUcreti = 6.50;
        double odenecekTutar = 0;

        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen araç tipini seçiniz:");
        System.out.println("1: Taksi");
        System.out.println("2: Minibüs");
        System.out.println("3: Ticari Araç");
        int aracTuru = klavye.nextInt();

        System.out.println("Lütfen kalınan saat bilgisini giriniz.");
        int saat = klavye.nextInt();

        if(aracTuru == 1) {
            for (int i = 1; i <= saat; i++) {
                odenecekTutar += taksiUcreti + (taksiUcreti * 20) / 100;
            }
        } else if (aracTuru == 2) {
            odenecekTutar = minibusUcreti * saat;
            odenecekTutar += (odenecekTutar * 21.5) / 100;
        } else if (aracTuru == 3) {
            odenecekTutar = ticariAracUcreti * saat;
            odenecekTutar += (odenecekTutar * 25) / 100;
        }

        System.out.println("Ödenecek tutar: " + Math.round(odenecekTutar) + " TL");
    }
}
