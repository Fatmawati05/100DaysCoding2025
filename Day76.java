import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input teks
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String teks = input.nextLine();

        // equals()
        System.out.print("Masukkan teks pembanding (equals): ");
        String banding1 = input.nextLine();
        System.out.println("Hasil equals(): " + teks.equals(banding1));

        // equalsIgnoreCase()
        System.out.print("Masukkan teks pembanding (equalsIgnoreCase): ");
        String banding2 = input.nextLine();
        System.out.println("Hasil equalsIgnoreCase(): " + teks.equalsIgnoreCase(banding2));

        // contains()
        System.out.print("Masukkan kata yang ingin dicek (contains): ");
        String kata = input.nextLine();
        System.out.println("Hasil contains(): " + teks.contains(kata));

        // isEmpty()
        System.out.println("Apakah teks awal kosong? " + teks.isEmpty());
    }
}
