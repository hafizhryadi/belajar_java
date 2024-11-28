/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ratarataperulangan;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Ratarataperulangan {
    public static void main(String[] args) {
        int x, i, jml;
        double rerata;
        
        i = 1;
        jml = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa jumlah angka: ");
        x = scan.nextInt();
        
        do{
            System.out.print(i + " ");
            jml = jml + i;
            i++;
        }while(i<=x);
        System.out.println("= " + jml);
        
        rerata = jml / x;
        System.out.println("Rata ratanya adalah: " + rerata);
    }
}
