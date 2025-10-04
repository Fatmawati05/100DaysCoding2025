import java.util.Scanner;
public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("a : ");
        int a = input.nextInt();
        System.out.println("b : ");
        int b = input.nextInt();

        System.out.println("Sebelum ditukar : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sesudah ditukar : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
