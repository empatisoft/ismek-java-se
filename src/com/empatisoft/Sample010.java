package com.empatisoft;
import java.util.Scanner;
/**
 * Created by Webmaster on 3.11.2016.
 */
public class Sample010 {
    public static void main(String[] args){

        // Kısa ve uzun kenarı klavyeden girilen dikdörtgenin çevresi ve alanını yazalım.
        Scanner giris = new Scanner(System.in);
        int kisa_kenar, uzun_kenar;
        System.out.println("Lütfen kısa kenarı giriniz.");
        kisa_kenar = giris.nextInt();
        System.out.println("Lütfen uzun kenarı giriniz.");
        uzun_kenar = giris.nextInt();

        int cevre = 2 * (kisa_kenar + uzun_kenar);
        int alan =  kisa_kenar * uzun_kenar;

        System.out.println("Çevresi: " + cevre + ", Alanı: " + alan);
    }
}
