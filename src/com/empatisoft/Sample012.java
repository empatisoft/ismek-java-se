package com.empatisoft;
import java.util.Scanner;

public class Sample012 {
    public static void main(String[] args){
        // Kullanıcıdan veri alımı
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz.");
        String adi = sc.nextLine();
        System.out.println("Lütfen soyadınızı giriniz.");
        String soyadi = sc.nextLine();
        System.out.printf("Adı: %s, Soyadı: %s", adi, soyadi);
    }
}
