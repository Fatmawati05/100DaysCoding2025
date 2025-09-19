import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Input data
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                
                System.out.print("Umur : ");
                int umur = sc.nextInt();
                sc.nextLine(); // membersihkan enter

                System.out.print("Alamat : ");
                String alamat = sc.nextLine();

                System.out.print("Hobi : ");
                String hobi = sc.nextLine();

                System.out.print("Tinggi Badan (cm) : ");
                double tinggiB = sc.nextDouble();

                System.out.print("Berat Badan (kg) : ");
                double beratB = sc.nextDouble();

                // Output data
                System.out.println("BIODATA SAYA");
                System.out.println("Nama         : " + nama);
                System.out.println("Umur         : " + umur + " tahun");
                System.out.println("Alamat       : " + alamat);
                System.out.println("Hobi         : " + hobi);
                System.out.println("Tinggi Badan : " + tinggiB + " cm");
                System.out.println("Berat Badan  : " + beratB + " kg");
            }
                  }
