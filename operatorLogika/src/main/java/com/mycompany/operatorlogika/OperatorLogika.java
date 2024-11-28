/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operatorlogika;

/**
 *
 * @author Pongo
 */
public class OperatorLogika {

    public static void main(String[] args) {
        boolean java = true;
        boolean mahasiswa = true;
        boolean golang = false;
        boolean hasil;
        
        //konjungsi
        hasil = java && mahasiswa;
        System.out.println("Mahasiswa menggunakan java? " + hasil);
        
        hasil = golang && mahasiswa;
        System.out.println("Mahasiwa menggunakan golang? " + hasil);
        
        //disjungsi
        hasil = golang || java;
        System.out.println("golang dan java merupakan bahasa pemrograman, " + hasil);
        
        //negasi
        System.out.println("Negasi, !true = " + !java);
        System.out.println("Negasi, !false = " + !golang);
    }
}
