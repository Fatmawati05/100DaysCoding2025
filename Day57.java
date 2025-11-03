public class Day57 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) { // perulangan luar
            System.out.println("perulangan keluar: " + i);

            for (int j = 1; j <= 3; j++) { // perulangan dalam
                System.out.println("perulangan kedalam: " + j);
            }
        }
    }
}
