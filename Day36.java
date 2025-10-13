import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input umur
        System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt();

        // Input status tiket
        System.out.print("Apakah kamu punya tiket? (true/false): ");
        boolean punyaTiket = input.nextBoolean();

        // Logika nested if
        if (umur >= 18) {
            if (punyaTiket) {
                System.out.println("Kamu boleh masuk ke acara.");
            } else {
                System.out.println("Kamu butuh tiket untuk masuk.");
            }
        } else {
            System.out.println("Kamu harus berusia minimal 18 tahun untuk masuk.");
        }
    }
}
