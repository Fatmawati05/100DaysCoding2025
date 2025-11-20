import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
//        for (int i = 3; i <= 100; i+= 3) {
//            if (i <= 50)
//         // if (i % 2 == 0)
//            System.out.println(i);
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. nasi");
//        System.out.println("2. ayam");
//        System.out.println("pilih");
//        int pilih = sc.nextInt();
//
//        switch (pilih) {
//            case 1:
//                System.out.println("nasi");
//                break;
//            case 2:
//                System.out.println("ayam");
//                break;
//            default :
//                System.out.println("error");
//                break;
//        }

//        Scanner input = new Scanner (System.in);
//        System.out.print("input : ");
//        int tinggi = input.nextInt();
//
//        String hasil = (tinggi >= 160) ? "Kamu tinggi" : "Kamu pendek";
//
//        System.out.println(hasil);

        int i = 1;
        do {
            if (i == 5) {
                i++;
                continue;
            }
            if (i == 7) {
                break;
            }
            System.out.println(i);
            i++;

        } while (true);
    }
}
