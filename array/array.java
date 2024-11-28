import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] array = new float[5];
        System.out.println("masukkan 5 buah nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print("data ke " + (i + 1) + ": ");
            array[i] = input.nextFloat();
        }
        System.out.println("nilai array: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
