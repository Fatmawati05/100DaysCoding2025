import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai = ");
        int nilai = sc.nextInt();

        if (nilai % 2 == 0 ){  // misal masukkan nilai 6 atau 7 
            System.out.println("Genap"); // kalo 6 hasilnya genap
        }else {
            System.out.println("Ganjil"); // kalo 7 hasilnya ganjil
        }
    }
}
