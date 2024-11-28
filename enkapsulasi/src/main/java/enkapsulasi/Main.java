package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        Jpop obj = new Jpop("Lemon", 2013);
        obj.showData();
        obj.setJudul("king");
        System.out.println("Judul lagu: " + obj.getJudul());

    }
}