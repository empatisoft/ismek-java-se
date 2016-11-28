package com.empatisoft;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample026 {
    public static void main(String[] args) {
        for (int a = 4, b = 6; a * b <= 100; a++, b+=2) {
            System.out.println("a de�i�keninin �u anki de�eri: " +a);
            System.out.println("b de�i�keninin �u anki de�eri: " +b);
            System.out.println("�arp�m i�leminin sonucu: " +a*b);
        }
    }
}
