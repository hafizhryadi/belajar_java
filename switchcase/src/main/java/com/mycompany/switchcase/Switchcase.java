/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchcase;

/**
 *
 * @author Pongo
 */
public class Switchcase {
    public static void main(String[] args) {
        char grade = 'A';
        switch(grade) {
            case 'A' -> System.out.println("Sangat baik");
            case 'B' -> System.out.println("bagus");
            case 'C' -> System.out.println("cukup");
            case 'D' -> System.out.println("kurang");
            case 'E' -> System.out.println("astaga");
            default -> System.out.println("invalid");
        }
        System.out.println("Grade kamu adalah " + grade);
    }
}
