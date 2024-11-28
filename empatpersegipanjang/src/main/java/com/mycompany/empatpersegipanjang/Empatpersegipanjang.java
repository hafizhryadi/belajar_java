/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empatpersegipanjang;
import java.util.Scanner;

/**
 *
 * @author Pongo
 */
public class Empatpersegipanjang {
    public static void main(String[] args) {
        double pjg, lbr, luas, kllg, diag;
        int menu;
        System.out.println("Menu 4 persegi panjang");
        System.out.println("1. hitung luas");
        System.out.println("2. hitung keliling");
        System.out.println("3. hitung panjang diagonal");
        System.out.println("4. keluar");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih menu: ");
        menu = scan.nextInt();
        
        switch(menu) {
            case 1 ->  {
                System.out.print("Masukkan panjang: ");
                pjg = scan.nextInt();
                System.out.print("Masukkan lebar: ");
                lbr = scan.nextInt();
                luas = pjg * lbr;
                System.out.println("Luas: " + luas);
            }
            case 2 -> {
                System.out.print("Masukkan panjang: ");
                pjg = scan.nextInt();
                System.out.print("Masukkan lebar: ");
                lbr = scan.nextInt();
                kllg = 2*(pjg+lbr);
                System.out.println("Keliling: " + kllg);
            }
            case 3 -> {
                System.out.print("Masukkan panjang: ");
                pjg = scan.nextInt();
                System.out.print("Masukkan lebar: ");
                lbr = scan.nextInt();
                diag = Math.sqrt((pjg*pjg)+(lbr*lbr)); // akar pjg kuadrat + lbr kuadrat
                System.out.println("Diagonal: " + diag);
            }
            case 4 -> System.exit(0);
            default -> System.out.println("invalid");
        }
    }
}
