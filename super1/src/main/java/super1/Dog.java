package super1;
public class Dog extends Animal{
    String color = "Black";

    public void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
