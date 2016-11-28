package com.empatisoft;

import java.util.ArrayList;

/**
 * Created by Webmaster on 10.11.2016.
 */
public class Sample021 {
    public static void main(String[] args){
        ArrayList<String> aylarListesi = new ArrayList<>();
        int ay = 9;

        switch (ay) {
            case 1: aylarListesi.add("Ocak");
            case 2: aylarListesi.add("Şubat");
            case 3: aylarListesi.add("Mart");
            case 4: aylarListesi.add("Nisan");
            case 5: aylarListesi.add("Mayıs");
            case 6: aylarListesi.add("Haziran");
            case 7: aylarListesi.add("Temmuz");
            case 8: aylarListesi.add("Ağustos");
            case 9: aylarListesi.add("Eylül");
            case 10: aylarListesi.add("Ekim");
            case 11: aylarListesi.add("Kasım");
            case 12: aylarListesi.add("Aralık");
                break;
            default:
                System.out.println("Hatalı ay bilgisi");
                break;
        }

        if (aylarListesi.isEmpty()) {
            System.out.println("Hatalı ay bilgisi");
        } else {
            for (String ayAdi : aylarListesi) {
                System.out.println(ayAdi);
            }

        }
    }
}
