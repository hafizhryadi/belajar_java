package com.example.sepeda;

public class SepedaGunung extends Sepeda{
    private String tipeSuspensi;

    // setTipeSuspensi
    public void setTipeSuspensi(String newValue) {
        tipeSuspensi = newValue;
    }

    // cekStatus
    public void cekStatus() {
        super.cekStatus();
        // Tipe suspensi
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }

}
