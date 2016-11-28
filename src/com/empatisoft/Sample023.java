package com.empatisoft;
import java.util.Scanner;
/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample023 {
    public static void main(String[] args) {
        // Bu program kullan�c�n�n girdi�i
		/* say�ya kadar olan t�m do�al say�lar�n karelerini g�sterir
		 * Programdan ��kmak i�in 0 t�klay�n�z.
		 * while d�ng�s� ile
		 */
        int kgs,karesi;
        Scanner s= new Scanner(System.in);
        do {
            System.out.println("l�tfen say� giriniz:");
            kgs=s.nextInt();
            if(kgs==0)
            {
                System.out.println("0 girdiniz d�ng� sonland�");
                break;
            }
            karesi=kgs*kgs;
            System.out.println(kgs+" karesi " + karesi);

        } while (!(kgs==0));

    }
}
