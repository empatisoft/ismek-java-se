package com.empatisoft;

/**
 * Created by Webmaster on 27.10.2016.
 */
public class Sample004 {

    public static void main(String[] args) {
        // Tür dönüşümleri
        // Uygun olması durumunda değişken türünün değiştirilmesi durumudur.

        String say1 = "30";
        int dyas = Integer.valueOf(say1);
        int carp = dyas * 3;
        System.out.println(carp);

        String say2 = "15.6";
        double d1 = Double.valueOf(say2);
        System.out.println(d1 + 15.6);

        // ilkel türlerin kendi aralarında dönüşümleri
        float f1 = 10.5F;
        float f2 = 15.6F;
        int topla = (int) (f1 + f2);
        System.out.println(topla);


        // char -> int
        char c = '9';
        int gdc = Integer.valueOf(String.valueOf(c));
        System.out.println(gdc);
    }
}
