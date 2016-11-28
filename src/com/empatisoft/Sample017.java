package com.empatisoft;

import java.util.Scanner;

/**
 * Created by Webmaster on 10.11.2016.
 */
public class Sample017 {
    public static void main(String[] args){
        // Notlar 0 ile 100 arasında olacak.
        /*
        if-else if - else ile yapılacak
        * 92 ve üzeri AA
        * 85 ve üzeri BA
        * 80 ve üzeri BB
        * 75 ve üzeri CB
        * 67 ve üzeri CC
        * 58 ve üzeri DC
        * 50 ve üzeri DD
        * 50 nin altı FF
        *
        * */
        int not = 0;
        Scanner oku = new Scanner(System.in);
        System.out.println("Lütfen not giriniz");
        not = oku.nextInt();

        if(not < 50) {
            System.out.println("Harf notu: FF");
        }
        else if(not >= 50 && not <= 57) {
            System.out.println("Harf notu: DD");
        }
        else if(not >= 58 && not <= 66) {
            System.out.println("Harf notu: DC");
        }
        else if(not >= 67 && not <= 74) {
            System.out.println("Harf notu: CC");
        }
        else if(not >= 75 && not <= 79) {
            System.out.println("Harf notu: CB");
        }
        else if(not >= 80 && not <= 84) {
            System.out.println("Harf notu: BB");
        }
        else if(not >= 85 && not <= 91) {
            System.out.println("Harf notu: BA");
        }
        else if(not >= 91 && not <= 100) {
            System.out.println("Harf notu: AA");
        }
        else
        {
            System.out.println("Lütfen 0 ile 100 arasında not giriniz.");
        }
    }
}
