import java.util.Scanner;

public class Day49 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Masukkan usia kamu: ");  
    int usia = input.nextInt();  

    String status = (usia >= 18) ? "Dewasa" : "Belum Dewasa";  

    System.out.println("Status kamu: " + status);  
    }
}
