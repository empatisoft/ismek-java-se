package com.empatisoft;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Webmaster on 25.11.2016.
 */
public class Exam4 {
    public static void main(String[] args) {
        /**
         * SORU
         * Eleman sayısı klavyeden girilerek bir sayısal dizi oluşturulacaktır. Diziye 0-1000 arasında rastgele tek ve beşin katlarında değer atanacaktır. Diziye değer atandıktan sonra dizi elemanları ekrana yazdırılacaktır.
         *
         * ÇIKTISI:
         *
         Lütfen dizinin eleman sayısını giriniz.
         100
         Rastgele üretilen 100 sayının tek ve beşin katı olan  12 adettir ve aşağıda listelenmektedir:
         Eleman: 505
         Eleman: 295
         Eleman: 15
         Eleman: 935
         Eleman: 165
         Eleman: 15
         Eleman: 595
         Eleman: 545
         Eleman: 595
         Eleman: 645
         Eleman: 715
         Eleman: 555
         */

        Random rastgele = new Random();
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen dizinin eleman sayısını giriniz.");
        int elemanSayisi = klavye.nextInt();

        ArrayList<Integer> elemanlar = new ArrayList<>();

        for (int j = 0; j < elemanSayisi; j++) {
            int deger = rastgele.nextInt(1000);
            if (deger % 2 == 1 && deger % 5 == 0) {
                elemanlar.add(deger);
            }
        }

        int say = elemanlar.size();
        System.out.println("Rastgele üretilen " + elemanSayisi + " sayının tek ve beşin katı olan  " + say + " adettir ve aşağıda listelenmektedir:");


        for (int i = 0; i < elemanlar.size(); i++) {
            System.out.println("Eleman: " + elemanlar.get(i));
        }
    }
}
