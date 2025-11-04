import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        
        // Mencetak dari 1 ke N
        System.out.println("Angka dari 1 ke " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nAngka dari " + N + " ke 1:");
        // Mencetak dari N ke 1
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
