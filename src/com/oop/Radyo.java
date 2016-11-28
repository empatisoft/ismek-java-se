package com.oop;

/**
 * Created by Webmaster on 25.11.2016.
 */
public class Radyo {

    /**
     * Properties
     * 1: enYuksekSesDuzeyi
     * 2: enDusukSesDuzeyi
     * 3: simdikiSesDuzeyi
     * 4: enYuksekFrekans
     * 5: enDusukFrekans
     * 6: simdikiFrekans
     * 7: acik
     *
     * Methods
     * 1: acKapat
     * 2: sesAc
     * 3: sesKis
     * 4: frekansDegistir
     * 5: durumYazdir
     */

    final static int enYuksekSesDuzeyi = 100;
    final static int enDusukSesDuzeyi = 0;
    final static double enYuksekFrekans = 108;
    final static double enDusukFrekans = 85;

    public int simdikiSesDuzeyi;
    public double simdikiFrekans;
    public boolean acik;

    public Radyo() {
        acik = false;
        simdikiFrekans = enDusukFrekans;
        simdikiSesDuzeyi = enDusukSesDuzeyi;
    }
    public Radyo(boolean durum, double baslangicFrekansi, int baslangicSesDuzeyi) {
        acik = durum;
        simdikiFrekans = baslangicFrekansi;
        simdikiSesDuzeyi = baslangicSesDuzeyi;
    }
    public void acKapat() {
        if(acik == true)
        {
            acik = false;
        } else {
            acik = true;
        }
    }
    public void sesAc(int artisMiktari) {
        if (acik == true) {
             if(simdikiSesDuzeyi > enYuksekSesDuzeyi) {
                 simdikiSesDuzeyi = enDusukSesDuzeyi;
             } else {
                 simdikiSesDuzeyi = simdikiSesDuzeyi + artisMiktari;
             }
        }
    }
    public void sesKis(int azalisMiktari) {
        if (acik == true) {
            if(simdikiSesDuzeyi < enDusukSesDuzeyi) {
                simdikiSesDuzeyi = enDusukSesDuzeyi;
            } else {
                simdikiSesDuzeyi = simdikiSesDuzeyi - azalisMiktari;
            }
        }
    }
    public void frekansDegistir(double yeniFrekans) {
        if (acik == true) {
            if(enDusukFrekans <= yeniFrekans && yeniFrekans <= enYuksekFrekans) {
                simdikiFrekans = yeniFrekans;
            }
        }
    }
    public void durumYazdir() {
        System.out.println("Çalışıyor: " + acik);
        System.out.println("Şimdiki Frekans: " + simdikiFrekans);
        System.out.println("Şimdiki Ses Düzeyi: " + simdikiSesDuzeyi);
    }

}
