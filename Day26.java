public class Day26 {
    public static void main(String[] args) {

        int x = 15;  // nilai awal x = 15
        System.out.println("Nilai awal x = " + x); // hasilnya tetap 15

        x += 7;  // menambahkan 7 ke x
        System.out.println("Setelah x += 7 : " + x); // hasilnya 22

        x -= 4;  // mengurangi x dengan 4
        System.out.println("Setelah x -= 4 : " + x); // hasilnya 18

        x *= 3;  // mengalikan x dengan 3
        System.out.println("Setelah x *= 3 : " + x); // hasilnya 54

        x /= 5;  // membagi x dengan 5
        System.out.println("Setelah x /= 5 : " + x); // hasilnya 10

        x %= 4;  // sisa bagi x dengan 4
        System.out.println("Setelah x %= 4 : " + x); // hasilnya 2
    }
}
