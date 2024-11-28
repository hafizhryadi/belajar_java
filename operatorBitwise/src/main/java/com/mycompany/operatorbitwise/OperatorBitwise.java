/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operatorbitwise;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class OperatorBitwise {

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka pertama: ");
        num1 = input.nextInt();
        System.out.print("Input angka kedua: ");
        num2 = input.nextInt();
        int hasil;
        
        // operasi AND
        hasil = num1 & num2;
        System.out.println("num1 & num2 = " + hasil);
        
        // operasi OR
        hasil = num1 & num2;
        System.out.println("num1 | num2 = " + hasil);
        
        // operasi XOR
        hasil = num1 & num2;
        System.out.println("num1 ^ num2 = " + hasil);
        
        // operasi negasi
        hasil = ~num1;
        System.out.println("~num1 = " + hasil);
        
        // geser ke kiri 2 kali
        hasil = num1 << 2;
        System.out.println("num1 << 2 = " + hasil);
        
        // geser ke kanan 2 kali
        hasil = num1 >> 2;
        System.out.println("num1 >> 2 = " + hasil);
        
        // geser ke kanan 3 kali
        hasil = num1 >>> 2;
        System.out.println("num1 >>> 2 = " + hasil);
    }
}
