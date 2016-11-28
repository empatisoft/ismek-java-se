package com.empatisoft;

/**
 * Created by Webmaster on 3.11.2016.
 */
public class Sample008 {

    public static void main(String[] args) {

        // Kenar uzunluğu 8 cm olan karenin alanı
        double kenar = 8;
        double alan = Math.pow(kenar,2);
        double cevresi = kenar * 4;
        System.out.println("Alanı: " + alan);
        System.out.println("Çevresi: " + cevresi);
    }
}
