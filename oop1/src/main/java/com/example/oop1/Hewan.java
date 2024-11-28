package com.example.oop1;

public class Hewan extends Manusia{
    // inheritance
    String suara;

    public void mengaum(String s) {
        suara = s;
    }

    public String suara() {
        return suara;
    }
    
}
