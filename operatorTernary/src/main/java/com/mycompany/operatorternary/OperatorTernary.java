/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operatorternary;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class OperatorTernary {

    public static void main(String[] args) {
        int bayar;
        int harga = 50000;
        System.out.println("Total belanja Rp. " + harga);
        Scanner input = new Scanner(System.in);
        System.out.print("Input nominal uang anda: ");
        bayar = input.nextInt();
        
        String respon;
        // menggunakan operator ternary
        respon = bayar < harga ? "Uang anda kurang" 
                : bayar == harga ? "uang anda pas" 
                : bayar > harga ? "Kembalian anda " + (bayar - harga) 
                : "input salah";
        System.out.println(respon);
        
    }
}
