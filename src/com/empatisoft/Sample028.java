package com.empatisoft;
import java.util.Scanner;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample028 {
    public static void main(String[] args) {
        // Girilen limit degerine kadar olan t�m asal say�lar
        System.out.println("L�tfen bir say� giriniz???");
        Scanner s= new Scanner(System.in);
        int limit= s.nextInt();
        System.out.println("1 ile " +limit+ " aras�ndaki asal say�lar");

        //1.for d�ng�s�
        for (int i = 1; i <limit; i++) {
            boolean durum = true;

            //2.for d�ng�s�
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    durum = false;
                    break;
                }
            }
            //denetle ve yazd�r
            if(durum)
                System.out.println(i + " ");
        }

    }
}
