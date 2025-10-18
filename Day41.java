import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = sc.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = sc.nextDouble();

        double gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("gaji pokok : " + gajiPokok);
        System.out.println("tunjangan : " + tunjangan);
        System.out.println("potongan : " + potongan);
        System.out.println("Gaji bersih = " + gajiBersih);
    }
}
