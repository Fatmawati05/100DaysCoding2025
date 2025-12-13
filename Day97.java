import java.util.Scanner;

public class Day97 {
    static int LuasPersegi(int sisi){
        return sisi * sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maasukkan panjang sisi : ");
        int sisi = sc.nextInt();

        int luas = LuasPersegi(sisi);
        System.out.println("Luas Persegi : " + luas);
    }
}
