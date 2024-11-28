import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] piksel = new int[2][3];
        System.out.println("Masukkan data array 2d: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("data ke ["+(i+1)+"]" + "["+(j+1)+"] : ");
                piksel[i][j] = input.nextInt();
            }
        }
        System.out.println("data array 2d: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(piksel[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
