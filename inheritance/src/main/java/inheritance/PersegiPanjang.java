package inheritance;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int p) {
        panjang = p;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int l) {
        lebar = l;
    }

    public int Luas() {
        int luas = panjang * lebar;
        return luas;
    }
}
