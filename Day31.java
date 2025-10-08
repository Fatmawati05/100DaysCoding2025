public class Day31 {
    public static void main(String[] args) {
        int angka1 = 10;
        int angka2 = 20;

        System.out.println(angka1 > 4 && angka2 > 8); // true && true = true
        System.out.println(angka1 > 4 && angka2 < 8); // true && false = false
        System.out.println(angka1 < 4 && angka2 > 8); // false && true = false
    }
}
