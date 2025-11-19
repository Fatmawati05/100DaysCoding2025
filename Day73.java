import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Fatmawati");
            System.out.println("2. Umur");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("Halo Fatmawati");
            } else if (pilih == 2) {
                System.out.println("Umurmu 20 tahun");
            }
            System.out.println();
        } while (pilih != 3);
        System.out.println("Selesai.");
    }
}
