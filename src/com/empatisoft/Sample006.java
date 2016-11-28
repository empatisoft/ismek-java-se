package com.empatisoft;

/**
 * Created by Webmaster on 27.10.2016.
 */
public class Sample006 {
    public static void main(String[] args) {
        int sayi1 = 16;
        int sayi2 = 8;
        int sonuc;

        sonuc = sayi1 + sayi2;
        System.out.println("Toplama Sonucu: " + sayi1 + " + " + sayi2 + " = " + sonuc);

        sonuc = sayi1 - sayi2;
        System.out.println("Çıkarma Sonucu: " + sayi1 + " - " + sayi2 + " = " + sonuc);

        sonuc = sayi1 * sayi2;
        System.out.println("Çarpma Sonucu: " + sayi1 + " * " + sayi2 + " = " + sonuc);

        sonuc = sayi1 / sayi2;
        System.out.println("Bölme Sonucu: " + sayi1 + " / " + sayi2 + " = " + sonuc);

        sonuc = sayi1 % sayi2;
        System.out.println("Kalan Sonucu: " + sayi1 + " % " + sayi2 + " = " + sonuc);

    }
}
