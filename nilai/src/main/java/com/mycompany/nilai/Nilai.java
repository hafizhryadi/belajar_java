/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilai;

import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Nilai {

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("input angka: ");
        a = scan.nextInt();
        
        String b = a > 80 ? "A" : a > 69 ? "B" : a > 54 ? "C" : a > 40 ? "D" : a > 0 ? "E" : "Salah";
        System.out.println(b);
    }
}
