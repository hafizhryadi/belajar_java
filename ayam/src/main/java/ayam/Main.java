package ayam;

public class Main {
    public static void main(String[] args) {
        Ayam ayam = new Ayam("rambo", 5);
        System.out.println(ayam.showAyam());

        ayam.setNama("Dani");
        ayam.setUmur(12);
        System.out.println(ayam.showAyam());

        ayam.setNama("Fairuz");
        ayam.setUmur(15);
        System.out.println(ayam.showAyam());

        ayam.setNama(" ");
        ayam.setUmur(900);
        System.out.println(ayam.showAyam());
        
    }
}