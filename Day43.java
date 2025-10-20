import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai antara 0–100 = ");
        int nilai = sc.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai >= 80) {
            System.out.println("Predikat A");
        } else if (nilai >= 70) {
            System.out.println("Predikat B");
        } else if (nilai >= 55) {
            System.out.println("Predikat C");
        } else if (nilai >= 1) {
            System.out.println("Predikat D");
        } else {
            System.out.println("Predikat E");
        }
    }
}
