/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tipedatacasting;

/**
 *
 * @author Pongo
 */
public class TipedataCasting {

    public static void main(String[] args) {
        // byte > short > char > int > long > float > double
        // otomatis hanya bisa dilakukan dari kecil ke besar
        // dari besar ke kecil menggunakan manual
        
        // casting otomatis
        int number = 9;
        double myNumber = number;
        
        System.out.println(number);
        System.out.println(myNumber);

        // casting manual
        double angka = 3.14d;
        int angkaBulat = (int)angka;
        
        System.out.println(angka);
        System.out.println(angkaBulat);
    }
}
