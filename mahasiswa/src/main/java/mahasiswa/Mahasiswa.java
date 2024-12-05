package mahasiswa;

public class Mahasiswa {
    private String nama;
    private int nim;
    private double ipk;

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    Mahasiswa(String nama, int nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public void show() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
    }

}
