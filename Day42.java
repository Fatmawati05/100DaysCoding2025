import java.util.Scanner;

public class Days42 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan batas angka : ");  
    int batas = sc.nextInt();  

    System.out.println("Kelipatan 3 : ");  
    for (int i = 1; i <= batas; i++) {  
        if (i % 3 == 0) {  
            System.out.print(i + " ");  
          }  
      }  

    System.out.println("Kelipatan 5 : ");  
    for (int i = 1; i <= batas; i++) {  
        if (i % 5 == 0) {  
            System.out.print(i + " ");  
          }  
      }  

    System.out.println("Kelipatan 3 dan 5 : ");  
    for (int i = 1; i <= batas; i++) {  
        if (i % 3 == 0 && i % 5 == 0) {  
            System.out.print(i + " ");  
          }  
      }  
   }
}
