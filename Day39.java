import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Makanan");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mie ayam");
        System.out.println("3. Bakso lava");
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = sc.nextInt();

        System.out.println();

        if ( pilihan == 1){
            System.out.println("anda pilih Nasi goreng");
        } else if (pilihan == 2) {
            System.out.println("anda pilih Mie ayam");
        }else if (pilihan == 3) {
            System.out.println("anda memilih Bakso lava");
        }else {
            System.out.println("menu tidak ada");
        }
        System.out.println("TERIMA KASIH SUDAH MEMESAN !!");
    }
}
