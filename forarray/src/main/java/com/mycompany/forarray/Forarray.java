/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forarray;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Forarray {
    public static void main(String[] args) {
        int nilai[] = new int[5];
        int i;
        int jumlah = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan 5 nilai");
        for(i = 0; i<5; i++) {
            System.out.print("data ke " + (i+1) + ": ");
            nilai[i] = scan.nextInt();
        }
        System.out.println("data yg dimasukkan: ");
        for(i = 0; i<5; i++) {
            System.out.print(nilai[i] + " ");
            jumlah = jumlah + nilai[i];
        }
        System.out.println("= " + jumlah);
        double rerata = jumlah / i;
        System.out.println(rerata);
    }
}
