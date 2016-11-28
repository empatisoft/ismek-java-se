package com.empatisoft;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample030 {
    public static void main(String[] args){
        // Özel for kullanımı
        int [] tekSayilarDizi = {1,3,5,7,9};
        System.out.println("For döngüsü çıktısı");
        System.out.println("------------");
        for (int i = 0; i < tekSayilarDizi.length; i++) {
            System.out.println(tekSayilarDizi[i]);
        }

        System.out.println("Özelleştirilmiş for döngüsü");
        for (int i: tekSayilarDizi) {
            System.out.println(i);
        }
    }
}
