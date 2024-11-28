package enkapsulasi;

public class Jpop extends Pop {
    private int tahunTerbit;

    Jpop(String judul, int tahun) {
        setJudul(judul);
        tahunTerbit = tahun;
    }

    public void showData() {
        System.out.println("Judul Lagu: " + getJudul());
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
