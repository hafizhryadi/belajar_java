package inheritance;
// 21 nov

public class Main {
    public static void main(String[] args) {
        PersegiPanjang a = new PersegiPanjang();
        Balok b = new Balok();

        a.setLebar(5);
        a.setPanjang(10);
        System.out.println("Pewarisan");
        System.out.println("Panjang: " + a.getPanjang());
        System.out.println("Lebar: " + a.getLebar());
        System.out.println("Luas Persegi Panjang : " + a.Luas());


        b.setTinggi(2);
        b.setPanjang(3);
        b.setLebar(4);
        System.out.println("Balok");
        System.out.println("Panjang: " + b.getPanjang());
        System.out.println("Lebar: " + b.getLebar());
        System.out.println("Tinggi: " + b.getTinggi());
        System.out.println("Luas Balok : " + b.Luas());

    }
}