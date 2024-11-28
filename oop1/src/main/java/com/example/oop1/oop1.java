package com.example.oop1;

public class oop1{
    // 1 class mengeluarkan 3 object
    public static void main(String[] args) {
        Manusia arrManusia[] = new Manusia[3]; // array dari object

        Manusia objectManusia = new Manusia(); // constructor 1
        objectManusia.setNama("Muhammad Hafizh Ryadi");
        objectManusia.setUmur(18);
        
        Manusia objectManusia2 = new Manusia(); // constructor 2
        objectManusia2.setNama("Fairuz");
        objectManusia2.setUmur(18);
        
        Manusia objectManusia3 = new Manusia(); // constructor 3
        objectManusia3.setNama("Shetya");
        objectManusia3.setUmur(20);
        
        arrManusia[0] = objectManusia;
        arrManusia[1] = objectManusia2;
        arrManusia[2] = objectManusia3;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nama: " + arrManusia[i].getNama() + ", Umur: " + arrManusia[i].getUmur());
        }

        Hewan objectHewan = new Hewan();
        objectHewan.mengaum("Meong");
        System.out.println(objectHewan.suara());
        // penggunaan inheritance
        objectHewan.setNama("Kucing");
        System.out.println("Nama hewan: " + objectHewan.getNama());
    }
}
