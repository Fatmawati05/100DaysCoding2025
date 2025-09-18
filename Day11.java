import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String → membaca teks (contoh: nama)
        System.out.print("String : ");
        String nama = input.nextLine(); 

        // int → membaca angka bulat (contoh: umur)
        System.out.print("int : ");
        int umur = input.nextInt(); 

        // double → membaca angka desimal besar (contoh: tinggi)
        System.out.print("double : ");
        double tinggi = input.nextDouble(); 

        // float → membaca angka desimal kecil (contoh: berat)
        System.out.print("float : ");
        float berat = input.nextFloat(); 

        // long → membaca angka bulat besar (contoh: nomor besar)
        System.out.print("long : ");
        long nomor = input.nextLong(); 

        // byte → membaca angka kecil
        System.out.print("byte : ");
        byte nilaiByte = input.nextByte(); 

        // short → membaca angka sedang
        System.out.print("short : ");
        short nilaiShort = input.nextShort(); 

        // boolean → membaca logika (true / false)
        System.out.print("boolean : ");
        boolean mahasiswa = input.nextBoolean(); 

        // char → membaca 1 huruf (contoh: L atau P)
        System.out.print("char : ");
        char gender = input.next().charAt(0); 

        input.close();
    }
}
