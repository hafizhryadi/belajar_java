package enkapsulasi;

public class Jazz extends Pop {
    private String penyanyi;
    // setter
    public void setPenyanyi(String nama) {
        setJudul("Indonesia Raya");
        penyanyi = nama;
    }
    // getter
    public String getPenyanyi() {
        return penyanyi;
    }

    public void showPenyanyi() {
        System.out.println("Nama penyanyi: " + penyanyi);
    }
}
