package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 4.11.2016.
 */
public class Sample013 {

    public static void main(String[] args) {
        // if, if-else, else if, switch
        /*
        * Programda karar verme durumlarında kullanılır.
        * */

        Scanner oku = new Scanner(System.in);

        /*String adi = "Onur";

        if(adi == "Onur") {
            System.out.println("Koşul oldu.");
        }
        else
        {
            System.out.println("Koşul sağlanmadı");
        }

        // Gövdesiz if

        System.out.println("Lütfen yaşınızı giriniz.");
        String yas = oku.nextLine();
        if(yas.equals("20")) {
            System.out.println("Sen gençsin");
        }

        if(yas.equals("30")) {
            System.out.println("Sen orta yaşlısın");
        }

        System.out.println("Lütfen gün giriniz.");
        String gun = oku.nextLine();
        switch (gun) {
            case "pazar":
                System.out.println("Günlerden pazar");
                break;
            case "pazartesi":
                System.out.println("Günlerden pazartesi");
                break;
            case "salı":
                System.out.println("Günlerden salı");
                break;
            default:
                System.out.println("Gün bulunamadı");
                break;
        }*/

        String bolum = "muh";
        String sinif = "3";
        if (bolum.equals("muh") && sinif.equals("3")) {
            System.out.println("Şart uydu");
        }


    }
}
