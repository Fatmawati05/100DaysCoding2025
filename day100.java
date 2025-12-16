import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().toUpperCase(); 

        int tahap = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (tahap == 0 && ch == 'I') {
                tahap = 1;
            } else if (tahap == 1 && ch == 'S') {
                tahap = 2;
            } else if (tahap == 2 && ch == 'C') {
                System.out.println("CANTIK");
                return;
            }
        }

        System.out.println("TIDAK CANTIK");
    }
}
