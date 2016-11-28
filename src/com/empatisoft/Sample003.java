package com.empatisoft;

/**
 * Created by Webmaster on 27.10.2016.
 */
public class Sample003 {

    public static void main(String[] args) {
        byte byteSayi = (byte)6;
        short shortSayi = (short)10;

        // int dışındaki veri tiplerine elle değer atadığımızda bunları cast etmek gerekir.

        System.out.println("Byte = " + byteSayi);
        System.out.println("Short = " + shortSayi);

        int intSayi = 32;
        long longSayi = 64L;
        System.out.println("integer = " + intSayi);
        System.out.println("long = " + longSayi);

        // Long değişkenine elle değer atayabilmek için L literalini eklememiz gerekir. Aksi halde 64 değerini int olarak kabul eder.

        int geciciInt = intSayi / 2;
        System.out.println(geciciInt);
        // byte ve short sayılara bir hesaplamanın sonucunu atarken byte ve short değerlere cast edilir.

        //Float
        float floatSayi = 15.1F;
        float floatSayi2 = (float) 11.55;
        // bir noktalı sayı aksi belirtilmediği sürece double kabul edilir. Bu nedenle elle atamalarda atanan sayının sonunda F kullanılabilir ya da (float) kullanarak sayı floata çeviririlir.
        System.out.println("Float Sayı = " + floatSayi);
        System.out.println("Float Sayı = " + floatSayi2);

        double doubleSayi = 124.12;
        // double sayılara elle atama yaparken herhangi bir cast e gerek yok.

        char c = 'A';
        // bir karakter elle atama yapılırken tekli tırnak kullanılır.
    }
}
