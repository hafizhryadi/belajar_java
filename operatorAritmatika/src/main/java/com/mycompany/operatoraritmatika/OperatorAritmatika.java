/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operatoraritmatika;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class OperatorAritmatika {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input nagka pertama: ");
        num1 = input.nextInt();
        System.out.println("Input nagka kedua: ");
        num2 = input.nextInt();
        
        // operasi
        System.out.println("Hasil penjumlahan = " + (num1 + num2));
        System.out.println("Hasil pengurangan = " + (num1 - num2));
        System.out.println("Hasil perkalian = " + (num1 * num2));
        System.out.println("Hasil pembagian = " + (num1 / num2));
        System.out.println("Hasil bagi = " + (num1 % num2));
    }
}
