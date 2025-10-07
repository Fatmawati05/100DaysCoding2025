import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nilai a = ");
        int a = sc.nextInt();
        System.out.print("nilai b = ");
        int b = sc.nextInt();

        System.out.println("Hasil perbandingan"); // misal nilai (a = 7) dan nilai (b = 10)
        System.out.println("a <= b : " + (a <= b)); // mkaa hasilnya true
        System.out.println("a >= b : " + (a >= b)); // hasilnya false
    }
}
