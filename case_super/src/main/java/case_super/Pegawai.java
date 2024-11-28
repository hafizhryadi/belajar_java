package case_super;

public class Pegawai extends Orang{
    int gaji;

    Pegawai(int id, String nama, int gaji) {
        super(id, nama);
        this.gaji = gaji;
    }

    public void tampil() {
        System.out.println(id + " " + nama + " " + gaji);

    }
}
