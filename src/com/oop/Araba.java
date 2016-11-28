package com.oop;

/**
 * Created by Webmaster on 24.11.2016.
 */
public class Araba {

    final static int enYuksekHiz = 180;
    final static int enDusukVites = 1;
    final static int enDusukHiz = 0;
    final static int enYuksekVites = 5;

    public int simdikiHiz;
    public boolean calisiyor;
    public int simdikiVites;

    public Araba() {
        calisiyor = false;
        simdikiHiz = 0;
        simdikiVites = 1;
    }

    public Araba(int baslangicHizi, int baslangicVitesi, boolean baslangicDurumu) {
        calisiyor = baslangicDurumu;
        simdikiHiz = baslangicHizi;
        simdikiVites = baslangicVitesi;
    }

    public void kontakCevir() {
        if (calisiyor == true) {
            calisiyor = false;
        } else {
            calisiyor = true;
        }
    }

    public void gazaBas(int artisMiktari) {
        if (calisiyor == true) {
            if((simdikiHiz + artisMiktari) > enYuksekHiz) {
                simdikiHiz = enYuksekHiz;
            } else {
                simdikiHiz = simdikiHiz + artisMiktari;
            }
        }
    }

    public void frenYap(int azalisMiktari) {
        if (calisiyor == true) {
            if((simdikiHiz - azalisMiktari) > enDusukHiz) {
                simdikiHiz = enDusukHiz;
            } else {
                simdikiHiz = simdikiHiz + azalisMiktari;
            }
        }
    }

    public void vitesArtir() {
        if (calisiyor == true) {
            if(simdikiVites < enYuksekVites) {
                simdikiVites++;
            }
        }
    }

    public void vitesAzalt() {
        if (calisiyor == true) {
            if(simdikiVites > enDusukVites) {
                simdikiVites--;
            }
        }
    }

    public void durumYazdir() {
        System.out.println("Çalışıyor: " + calisiyor);
        System.out.println("Şimdiki Hız: " + simdikiHiz);
        System.out.println("Şimdiki Vites: " + simdikiVites);
    }
}
