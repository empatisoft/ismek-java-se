package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 3.11.2016.
 */
public class Sample011 {
    public static void main(String[] args){
        // Çemberin çevresi ve alanı
        Scanner giris = new Scanner(System.in);
        final double pi = 3.14; // veya Math.PI
        double yari_cap;
        System.out.println("Lütfen çemberin yarı çapını giriniz.");
        yari_cap = giris.nextDouble();

        double cevre = 2 * pi * yari_cap;
        double alan = pi * Math.pow(yari_cap,2);

        //System.out.println("Çevresi: " + cevre + ", Alanı: " + alan);
        System.out.printf("Çevresi: %f, Alanı: %f", cevre, alan);
    }
}
