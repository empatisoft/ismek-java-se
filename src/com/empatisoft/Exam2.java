package com.empatisoft;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Webmaster on 24.11.2016.
 */
public class Exam2 {
    public static void main(String[] args) {
        /**
         * SORU: Toplama işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun başladığı zaman rastgele 2 tane 1-100 arasında sayı tutulacak, tutulan sayılar ekrana gösterilecek ve kullanıcıya bu sayıların toplamı nedir diye sorulacaktır. Eğer kullanıcı doğru cevap verirse "Tebrikler bildiniz" değil ise "Üzgünüm bilemediniz" diye mesaj verecektir. Her cevaptan sonra "Tekrar oyanamak ister misiniz (e/E)?" şeklinde sorulacak ve eğer "e" veya "E" ile karşılık verirse oyun tekrar başlayacaktır. Kullanıcının puanı her doğru cevap için 5 puan artacak, her yanlış için 2 puan azalacaktır. Oyun sonlandığında kullanıcının doğru ve yanlış sayısı ve puanı yazılacaktır.
         * */

        Random rastgele = new Random();
        Scanner klavye = new Scanner(System.in);

        int puan = 0;
        int dogru = 0;
        int yanlis = 0;
        int cevap = 0;
        boolean devam;

        do {
            int sayi_1 = rastgele.nextInt(100);
            int sayi_2 = rastgele.nextInt(100);
            int toplam = sayi_1 + sayi_2;

            System.out.println("Birinci sayı " + sayi_1 + " ve ikinci sayı " + sayi_2 + " ise bu sayıların toplamı nedir?");
            cevap = klavye.nextInt();

            if( toplam == cevap) {
                System.out.println("Tebrikler bildiniz.");
                puan += 5;
                dogru++;
            } else {
                System.out.println("Üzgünüm bilemediniz.");
                puan -= 2;
                yanlis++;
            }

            System.out.println("Tekrar oyanamak ister misiniz (e/E)?");
            String txt_devam = klavye.nextLine();

            if (txt_devam.equals("e")) {
                devam = true;
            } else {
                devam = false;
            }

        } while ( devam == true);

        if(devam == false) {
            System.out.println("Doğru sayısı: " + dogru + "\nYanlış sayısı: " + yanlis + "\nPuan: " + puan);
        }



    }
}
