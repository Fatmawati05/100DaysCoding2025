import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan bilangan : ");
        int bilangan = sc.nextInt();

        if (bilangan % 2 == 0){
            System.out.println("bilangan genap");
        }else {
            System.out.println("bilangan ganjil");
        }
    }
}
