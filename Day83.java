public class Day83 {
    public static void main(String[] args) {

        int[] angka = {4, 7, 2, 9, 5};

        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Jumlah elemen array = " + total);
    }
}
