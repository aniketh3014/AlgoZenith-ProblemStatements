import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int height = 6;
        for (int row = 0; row < height; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
