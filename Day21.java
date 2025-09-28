public class Day21 {

    public static void main(String[] args) {
       int a = 30;
       int b = 25;
       
       System.out.println("Sebelum ditukar");
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       
       a = a + b;
       b = a - b;
       a = a - b;
       
       System.out.println("Setelah ditukar");
       System.out.println("a = " + a);
       System.out.println("b = " + b);
    }
}
