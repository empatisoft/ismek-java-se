package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 10.11.2016.
 */
public class Sample020 {
    public static void main(String[] args){
        // Artık yıl uygulaması
        /*
        * Girdiğiniz ay ve yıl değerlerini göz önüne alarak ilgili ayın kaç gün olduğunu hesapla.
        * 1-3-5-7-8-10-12 aylarda gün sayısı 31
        * 4-6-9-11 aylarda gün sayısı 30
        * 2. ay 28 gün ancak 4 yılda bir 29
        * */
        Scanner oku = new Scanner(System.in);
        System.out.println("Yıl giriniz.");
        int yil = oku.nextInt();
        System.out.println("Ayı giriniz.");
        int ay = oku.nextInt();

        int gunSayisi = 0;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                if ((( yil % 4 == 0) && !(yil % 100 == 0) || (yil % 400 == 0))) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Geçersiz ay girdiniz.");
                break;
        }
        System.out.println(gunSayisi);
    }
}
