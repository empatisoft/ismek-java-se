package com.empatisoft;

/**
 * Created by Webmaster on 18.11.2016.
 */
public class Sample031 {
    public static void main(String[] args){

        /*
        *  *1
        *  *1*2
        *  *1*2*3
        *  *1*2*3*4
        *  *1*2*3*4*5
        *
        *  yazdıralım
        * */
        int i = 1;
        String mesaj = "";

        for (i = 1; i < 6; i++) {
            mesaj += "*" + i;
            System.out.println(mesaj);
        }


        /*
        *  20: ---------------------------
        *  19: --------------------------
        *  18: -------------------------
        *  *
        *  *
        *  *
        *  *
        *  1: -
        *
        * yazdıralım
        * */
        String mesaj2 = "";
        for (int j = 20; j >= 0; j--) {
            mesaj2 = "";
            for (int k = 0; k <= j; k++) {
                mesaj2 += "-";
            }
            System.out.println(mesaj2);
        }
    }
}
