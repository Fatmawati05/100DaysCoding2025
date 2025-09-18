import java.util.Scanner; // import Scanner

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // membuat objek Scanner

        System.out.print("Nama : "); 
        String nama = sc.nextLine(); // membaca input berupa teks karna kita pake Stirng

        System.out.print("Umur : "); // membaca input berupa angka karna kita pake integer
        int umur = sc.nextInt();
    }
}
