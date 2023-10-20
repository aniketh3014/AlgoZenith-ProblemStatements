import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the series ");
        int n = sc.nextInt();
        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i-1] + fibonacciSeries[i-2];
        }

        System.out.println("Fibonacci Series:");
        System.out.println(Arrays.toString(fibonacciSeries));
    }
}