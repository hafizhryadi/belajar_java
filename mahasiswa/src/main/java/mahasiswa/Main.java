package mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("fairuz", 87676, 3.9);
        mhs.show();
        
        mhs.setNama("Dani");
        mhs.setNim(435353);
        mhs.setIpk(3.9);
        mhs.show();
    }
}