package ayam;

public class Hewan {
    private String nama;
    private int umur;

    public Hewan(String nama, int umur) {
        setNama(nama);
        setUmur(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong");
        } else {
            this.nama = nama;
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur < 0 || umur > 15) {
            System.out.println("Usia harus diantara 0 dan 15 tahun");
        } else {
            this.umur = umur;
        }
    }

    private double menghitungProduksiPerHari() {
        if (umur <= 6) {
            return 2;
        } else if (umur <= 12) {
            return 1;
        } else {
            return 0.75;
        }
    }

    public double getProduksiPerHari() {
        return menghitungProduksiPerHari();
    }
}
