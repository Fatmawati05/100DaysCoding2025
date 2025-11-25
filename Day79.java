import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userBenar = "Fatma";
        String pwBenar = "2005";

        String user, pw;

        while (true) {
            System.out.print("Masukkan Username : ");
            user = input.nextLine();

            System.out.print("Masukkan Password : ");
            pw = input.nextLine();

            // Cek kecocokan
            if (user.equals(userBenar) && pw.equals(pwBenar)) {
                System.out.println("Login berhasil!");
                break;  // keluar dari loop
            } else {
                System.out.println("Username atau password salah, coba lagi.\n");
            }
        }
    }
}
