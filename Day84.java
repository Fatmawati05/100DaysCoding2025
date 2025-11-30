import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + nilai + " = " + (i * nilai));
        }
    }
}
