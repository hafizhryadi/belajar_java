package com.example.sepeda;

public class Sepeda {
    private String merek;
    private int kecepatan, gear;

    public void setMerk(String newValue) {
        merek = newValue;
    }

    // gantiGear
    public void gantiGear(int newValue) {
        gear = newValue;
    }

    // tambahKecepatan
    public int tambahKecepatan(int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    // rem
    public int rem(int decrement) {
        kecepatan -= decrement;
        return decrement;
    }

    // cekStatus
    public void cekStatus() {
        System.out.println("\n----------------------------------------------");
        System.out.println("Merek Sepeda: " + merek);
        System.out.println("Kecepatan Sepeda: " + kecepatan);
        System.out.println("Gear Sepeda: " + gear);
        
    }
}
