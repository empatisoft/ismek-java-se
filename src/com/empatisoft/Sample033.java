package com.empatisoft;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample033 {
    public static void main(String[] args){

        /*Random random = new Random();
        int r = random.nextInt(100);

        int kacSefer = 1;
        int tahmin;
        Scanner oku = new Scanner(System.in);

        //System.out.println(r);
        System.out.println("Lütfen tahminde bulunun. " + r);
        tahmin = oku.nextInt();
        do {
            kacSefer++;
			if (tahmin != r) {
                System.out.println("Hatalı tahmin. Lütfen tekrar deneyin. " + r);
                tahmin = oku.nextInt();
				continue;
			}
		} while (tahmin != r);

        System.out.println(kacSefer + ". denemenizde buldunuz. Tebrikler.");*/

        Random rastgele = new Random();
        int sayi = rastgele.nextInt(100);
        int say = 0;
        int tahmin;

        Scanner oku = new Scanner(System.in);
        do {
            System.out.println("Lütfen tahminde bulunun.");
            tahmin = oku.nextInt();
            say++;

            if (tahmin == sayi)
                System.out.println("Tebrikler. " + say + ". seferde buldunuz.");
            else if(tahmin < sayi)
                System.out.println("Lütfen daha büyük sayı giriniz.");
            else
                System.out.println("Lütfen daha küçük sayı giriniz.");
        } while (tahmin != sayi);
    }
}
