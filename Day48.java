import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil;

        switch (op) {
            case '+':
                hasil = a + b;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: tidak bisa membagi dengan nol!");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }
    }
}
