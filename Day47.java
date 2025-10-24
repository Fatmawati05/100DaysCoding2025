import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka 1-7 : ");
        int hari = sc.nextInt();

        String Namahari;

        switch (hari) {
            case 1:
                Namahari = "Senin";
                break;
            case 2:
                Namahari = "Selasa";
                break;
            case 3:
                Namahari = "Rabu";
                break;
            case 4:
                Namahari = "Kamis";
                break;
            case 5:
                Namahari = "Jumat";
                break;
            case 6:
                Namahari = "Sabtu";
                break;
            case 7:
                Namahari = "Minggu";
                break;
            default:
                Namahari = "Angka tidak valid";
        }
        System.out.println("Hari ke- " + hari + " adalah : " + Namahari);
    }
}
