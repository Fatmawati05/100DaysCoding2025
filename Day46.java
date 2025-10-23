import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai S : ");
        int S = sc.nextInt();
        System.out.println("Masukkan nilai L");
        int L = sc.nextInt();

        int selesai = (S + L) % 24;
        int bangun = 9 - selesai ;

        System.out.println("keluaran : " + bangun + "jam");
    }
}
