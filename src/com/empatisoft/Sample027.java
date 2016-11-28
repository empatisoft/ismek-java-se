package com.empatisoft;
import java.util.Scanner;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample027 {
    public static void main(String[] args) {
        // Klavyeden girilen limit de�erine kadar tek ve �ift
        //say�lar� ekrana for d�ng�s� ile yazd�ran programm

        System.out.println("L�tfen bir say� giriniz???");
        Scanner s= new Scanner(System.in);
        int Sayi= s.nextInt();

        for (int i = 0; i <= Sayi; i++) {
            if (i%2==0) {
                System.out.println(i+ " �ift");
            }
        }

        for (int j = 0; j <= Sayi; j++) {
            if (j%2==1) {
                System.out.println(j+ " Tek");
            }
        }


    }
}


