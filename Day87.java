import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = {4, 7, 2, 9, 5, 8};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Angka ditemukan!");
        } else {
            System.out.println("Angka tidak ditemukan!");
        }
    }
}
