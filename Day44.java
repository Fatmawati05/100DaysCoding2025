import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih menu (1-4): ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Nasi Goreng");
                break;
            case 2:
                System.out.println("Mie Ayam");
                break;
            case 3:
                System.out.println("Soto Ayam");
                break;
            case 4:
                System.out.println("Bakso");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
