package com.empatisoft;

/**
 * Created by Webmaster on 3.11.2016.
 */
public class Sample009 {

    public static void main(String[] args) {

        // Yarı çapı 7 cm olan çemberin çevresi ve alanı
        final double pi = 3.14;

        double yaricap = 7;
        double cevre = 2 * pi * yaricap;
        double alan = pi * Math.pow(yaricap,2);

        System.out.println("Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);
    }
}
