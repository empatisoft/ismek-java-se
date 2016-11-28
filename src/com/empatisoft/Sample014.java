package com.empatisoft;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Webmaster on 4.11.2016.
 */
public class Sample014 {

    public static void main(String[] args) {

        // Kullanıcıdan iki değer alınacak. Yaşı ve sınıfı.
        // Kurallar:
        // Yaşı 18 den büyük ise 3. veya 4. sınıfa başvurabilir.
        // Yaşı 18 den küçük ise 1 veya 2. sınıfa başvurabilir.
        // 17 3 -> red
        // 15 2 -> kabul
        // 32 4 -> kabul

        /*Scanner oku = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı yazınız.");
        int yas = oku.nextInt();
        System.out.println("Lütfen sınıfınızı yazınız.");
        int sinif = oku.nextInt();*/

        /*if (yas > 18 && sinif >= 3 && sinif < 5) {
            System.out.println("Başvuru yapabilirsiniz.");
        }
        else if (yas < 18 && sinif <= 2 && sinif > 0) {
            System.out.println("Başvuru yapabilirsiniz.");
        }
        else {
            System.out.println("Koşulları sağlayamadığınız için kayıt yapamazsınız.");
        }*/

        //boolean hata = false;
        /*String mesaj = "";

        if (yas >= 18 && (sinif == 3 || sinif == 4)) {
            mesaj = "Başvuru Kabul: 3 veya 4. sınıf";
        }
        else if (yas < 18 && (sinif == 1 || sinif == 2)) {
            mesaj = "Başvuru Kabul: 1 veya 2. sınıf";
        }
        else {
            mesaj = "Başvuru Red: Şartlar sağlanmadı";
            //hata = true;
        }

        System.out.println(mesaj);*/

        // else if kullanımı
        /*String adi = "";
        String soyadi = "";
        if (adi.equals("")) {
            JOptionPane.showInputDialog(null, "Lütfen adınızı giriniz");
        }
        else if (soyadi.equals("")) {
            JOptionPane.showInputDialog(null, "Lütfen soyadınızı giriniz.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Bütün bilgiler doğru girildi");
        }*/

        String s1, s2;
        Scanner in = new Scanner(System.in);

        System.out.println("İlk cümleyi giriniz.");
        s1 = in.nextLine();

        System.out.println("İkinci cümleyi giriniz.");
        s2 = in.nextLine();

        if (s1.equals(s2)) {
            System.out.println("İki cümle eşit");
        }
        else {
            System.out.println("İki cümle eşit değil");
        }
    }
}
