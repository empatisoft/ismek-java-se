package com.empatisoft;
import java.util.Scanner;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample024 {
    public static void main(String[] args) {
        // Klavyeden girilen say�n�n say� de�erleri toplam�n� ekrana yazd�r�n�z.
        //while
        Scanner s= new Scanner(System.in);
        int sayi, basamak;
        int toplam=0;

        System.out.println("Say� giriniz");
        sayi= s.nextInt();

        while(sayi!=0){
            basamak = sayi %10;
            toplam += basamak;
            sayi/=10;
        }
        System.out.println(toplam);
    }
}
