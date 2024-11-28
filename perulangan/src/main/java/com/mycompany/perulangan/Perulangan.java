/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan;

/**
 *
 * @author Pongo
 */
public class Perulangan {
    public static void main(String[] args) {
        int i = 1;
        // mengecek kondisi di awal
        while(i <= 10) {
            System.out.print(i++ + " ");
        }
        
        // mengecek kondisi di akhir
        int j = 1;
        do {
            System.out.print(j++ + " ");
        }while(j<=10);
        
        for(int k = 1; k <= 10; k++) {
            System.out.println(k + " ");
        }
        
        for(int a = 1; a <= 3; a++) {
            for(int b = 1; b <= 3; b++) {
                System.out.println(a + " " + b);
            }
        }
    }
}
