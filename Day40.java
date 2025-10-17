import java.util.Scanner;

public class Day40 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("=== APLIKASI KALKULATOR ===");  
    System.out.print("Silakan masukkan nilai pertama: ");  
    double nilai1 = input.nextDouble();  

    System.out.print("Pilih operasi matematika (+, -, *, /): ");  
    char operasi = input.next().charAt(0);  

    System.out.print("Silakan masukkan nilai kedua: ");  
    double nilai2 = input.nextDouble();  

    double hasil;  

    if (operasi == '+') {  
        hasil = nilai1 + nilai2;  
        System.out.println("Hasil penjumlahan: " + hasil);  
    } else if (operasi == '-') {  
        hasil = nilai1 - nilai2;  
        System.out.println("Hasil pengurangan: " + hasil);  
    } else if (operasi == '*') {  
        hasil = nilai1 * nilai2;  
        System.out.println("Hasil perkalian: " + hasil);  
    } else if (operasi == '/') {  
        if (nilai2 != 0) {  
            hasil = nilai1 / nilai2;  
            System.out.println("Hasil pembagian: " + hasil);  
        } else {  
            System.out.println("Maaf, tidak bisa membagi dengan nol!");  
        }  
    } else {  
        System.out.println("Operasi tidak valid!");  
    }  
  }
}
