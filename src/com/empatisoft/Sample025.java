package com.empatisoft;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample025 {
    public static void main(String[] args) {
        // i� i�e for d�ng�s� ve etiket kullan�m�
        for (int birinciSayi = 1; birinciSayi <= 3; birinciSayi++) {
            cikis:
            for (int ikinciSayi = 1; ikinciSayi <= 4; ikinciSayi++) {
                if (birinciSayi + ikinciSayi == 6) {
                    continue cikis;
                }
                System.out.println("Birinci Say�: " + birinciSayi +
                        "�kinci Say�: " +ikinciSayi);
            }
        }

    }
}
