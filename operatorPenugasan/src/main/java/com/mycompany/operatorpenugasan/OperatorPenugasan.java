/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operatorpenugasan;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class OperatorPenugasan {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka pertama: ");
        num1 = input.nextInt();
        System.out.println("Input angka kedua: ");
        num2 = input.nextInt();
        
        // Penambahan
        System.out.println("Penambahan : " + (num2 += num1));
        
        // Pengurangan
        System.out.println("Pengurangan : " + (num2 -= num1));
        
        // Perkalian
        System.out.println("Perkalian : " + (num2 *= num1));
        
        // Pembagian
        System.out.println("Pembagian : " + (num2 /= num1));
        
        // hasil bagi
        System.out.println("hasil bagi : " + (num2 %= num1));
    }
}
