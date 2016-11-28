package com.empatisoft;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Webmaster on 10.11.2016.
 */
public class Sample016 {
    public static void main(String[] args){
        Random random = new Random();
        double bakiye = (double)random.nextInt(2000);
        double limit = 500;
        double cekilecek = 0;
        System.out.println("Şu anki bakiyeniz: " + bakiye);
        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz");
        Scanner oku = new Scanner(System.in);
        cekilecek = oku.nextDouble();
        if(cekilecek <= bakiye) {
            if (cekilecek <= limit) {
                bakiye = bakiye - cekilecek;
                System.out.println("Çekilen para: " + cekilecek);
                System.out.println("Kalan para: " + bakiye);
            } else {
                System.out.println("Çekmek istediğiniz tutar için günlük limitiniz yeterli değildir.");
            }
        }
        else {
            System.out.println("Çekmek istediğiniz tutar için bakiyeniz yeterli değildir.");
        }
    }
}
