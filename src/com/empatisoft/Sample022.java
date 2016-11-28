package com.empatisoft;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample022 {
    public static void main(String[] args) {
        // while - do wile -for
		/*
		 * 1 ile 100 aras�nda yer alan 3 ve 5 ortak katlar�n�
		 * continue ifadesiyle dong�lerle yapmak
		 */
//		int sayi = 0;
        System.out.println("�� ve Be�in Ortak Katlar�:");

//		while (sayi <= 100) {
//			sayi++;
//			if (sayi %15!=0) {
//				continue;
//			}
//			System.out.println(sayi);
//
//		}

//		do {
//			sayi++;
//			if (sayi %15!=0) {
//				continue;
//			}
//			System.out.println(sayi);
//		} while (sayi<=100);

        for (int sayi = 0; sayi <= 100; sayi++) {
            if (sayi %15!=0) {
                continue;
            }
            System.out.println(sayi);
        }






    }
}
