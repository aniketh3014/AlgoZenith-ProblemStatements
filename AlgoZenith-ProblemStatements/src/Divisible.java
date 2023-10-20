import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0 && num % 3 == 0)
        {System.out.println(num + " is divisible by both 2 and 3.");} else
        {
            System.out.println(num + " is not divisible by both 2 and 3.");
        }
    }
}
