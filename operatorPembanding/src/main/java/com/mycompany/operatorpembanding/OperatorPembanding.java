/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.operatorpembanding;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class OperatorPembanding {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka pertama");
        num1 = input.nextInt();
        System.out.println("Input angka kedua");
        num2 = input.nextInt();
        
        // apakah A lebih besar dari B?
        String hasil = num1 > num2 ? "benar" : "salah";
        System.out.println(hasil);
        
        // apakah A lebih kecil dari B?
        hasil = num1 < num2 ? "benar" : "salah";
        System.out.println(hasil);
        
        // apakah A lebih besar sama dengan B?
        hasil = num1 >= num2 ? "benar" : "salah";
        System.out.println(hasil);
        
        // apakah A lebih kecil sama dengan B?
        hasil = num1 <= num2 ? "benar" : "salah";
        System.out.println(hasil);
        
        // apakah A sama dengan B?
        hasil = num1 == num2 ? "benar" : "salah";
        System.out.println(hasil);
        
        // apakah A tidak sama dengan B?
        hasil = num1 != num2 ? "benar" : "salah";
        System.out.println(hasil);
    }
}
