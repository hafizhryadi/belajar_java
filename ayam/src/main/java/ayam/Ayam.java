package ayam;

public class Ayam extends Hewan {
    public Ayam(String nama, int umur) {
        super(nama, umur);
    }
    
    public String showAyam() {
        return "Ayam " + getNama() + " umur " + getUmur() + " tahun, Produksi per hari: " + getProduksiPerHari() + " telur";
    }
}
