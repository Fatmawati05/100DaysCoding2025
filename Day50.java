import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai = ");
        int nilai = sc.nextInt();

        String bilangan = (nilai % 2 == 0) ? "Genap" : "Ganjil" ;
        System.out.println("Bilangan " + bilangan);
    }
}
