package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 10.11.2016.
 */
public class Sample019 {
    public static void main(String[] args){
        // Switch case
        int gun;
        System.out.println("Lütfen gün değerini sayı olarak giriniz. (1-7) aralığında");

        Scanner oku = new Scanner(System.in);
        gun = oku.nextInt();

        switch (gun) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Girilen değer geçersiz.");
                break;
        }

    }
}
