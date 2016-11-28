package com.oop;

/**
 * Created by Webmaster on 24.11.2016.
 */
public class OrnekAraba {
    public static void main(String[] args) {
        Araba opel = new Araba();
        opel.kontakCevir();
        opel.gazaBas(20);
        opel.vitesArtir();
        opel.gazaBas(20);
        opel.vitesArtir();
        opel.gazaBas(100);
        opel.durumYazdir();

        Araba toyota = new Araba(50,3,true);
        toyota.gazaBas(20);
        toyota.vitesArtir();
        toyota.gazaBas(20);
        toyota.vitesArtir();
        toyota.gazaBas(100);
        toyota.durumYazdir();
    }
}
