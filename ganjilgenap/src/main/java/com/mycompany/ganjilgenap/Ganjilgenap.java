/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ganjilgenap;
import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Ganjilgenap {

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("input angka: ");
        a = scan.nextInt();
        
       if (a%2 == 0) {
            System.out.println("genap");
       } else {
           System.out.println("ganjil");
      }    
    }
}
