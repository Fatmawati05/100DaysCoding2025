import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int a = 0, b = 1;

        System.out.println("Deret Fibonacci:");
        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
