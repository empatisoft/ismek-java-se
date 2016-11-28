package com.empatisoft;

/**
 * Created by Webmaster on 27.10.2016.
 */
public class Sample002 {
    public static void main(String[] args)
    {
        // String türü
        String adi = "Onur";
        String yasi = "32";
        String maas = "3500";

        System.out.println("Adı:" + adi + ", Yaşı: " + yasi + ", Maaşı: " + maas);

        // Tamsayı veri türleri
        // default değer 0
        int say1 = 10;
        int say2 = 20;
        int toplam = say1 + say2;
        System.out.println("Toplam: " + toplam);

        // Ondalıklı sayı türü
        // Double: virgülden sonra en fazla 16 karakter değer alır. 8 byte
        double d1 = 15.654;
        double d2 = 3.944;
        double sonuc = d1 - d2;
        System.out.println("Ondalıklı sonuç = " + sonuc);

        // Float
        // virgülden sonra en fazla 8 haneye kadar değer alır. 4 byte
        float f1 = (float) 10.5;
        float f2 = 10.5f;
        float f3 = f1 * f2;

        System.out.println("Float: " + f3);

        // char türü
        // 1 karakter
        char c1 = 'o';
        char c2 = 'n';
        char c3 = 'u';
        char c4 = 'r';

        System.out.println("Karakterler: " + c1 + c2 + c3 + c4);

        // byte türü
        // en fazla 127 karakter alır.
        byte b1 = 127;
        System.out.println(b1);

    }
}
