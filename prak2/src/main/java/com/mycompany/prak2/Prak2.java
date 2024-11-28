/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prak2;

/**
 *
 * @author Pongo
 */
public class Prak2 {

    public static void main(String[] args) {
        int x = 5;
        
        x+=3;
        x-=3;

        x >>= 3;
        
        System.out.println(x);
        
        // geser ke kanan
        // 5 = 00000101
        // geser 1 = 0000 0010
        // geser 2 = 0000 0001
        // geser 3 = 0000 0000
        
//        x <<= 3;
        // geser ke kiri
        // 5 = 0000 0101
        // 1 = 0000 1010
        // 2 = 0001 0100
        // 3 = 0010 1000
        
//        int x = 6;
//        x = x | 3;
    // 6 = 0000 0110
    // 3 = 0000 0011
    // 6 & 3 = 0000 0010 = 2
    // 6 | 3 = 0000 0111 = 7
    
        // & = bitwise
        // && = kondisonal logic

    }
}
