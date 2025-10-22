import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Sapa pengguna");
        System.out.println("2. Tampilkan pesan");
        System.out.print("Pilih menu: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Halo, selamat datang!");
                break;
            case 2:
                System.out.println("Ini adalah program switch-case sederhana.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
