public class Dog extends Animal {
    void makan() {
        System.out.println("Anjing makan");
    }
    void menggongong() {
        System.out.println("Guk guk");
    }
    void berjalan() {
        super.makan();
        menggongong();
    }
}
