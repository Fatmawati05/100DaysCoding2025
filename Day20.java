public class Day20 {
    public static void main(String[] args) {
       // deklarasi variabel primitif 
        int i = 21;
        byte b = 13;
        short s = 20;
        long l= 5000000;
        double d = 149.7;
        float f = 40.6f;
        char c = 'Z';
        boolean bl = false;

        // mengubah tipe data primitif jadi string
        String Sint = String.valueOf(i);
        String Sbyte = String.valueOf(b);
        String Sshort = String.valueOf(s);
        String Slong = String.valueOf(l);
        String Sdouble = String.valueOf(d);
        String Sfloat = String.valueOf(f);
        String Schar = String.valueOf(c);
        String Sboolean = String.valueOf(bl);

        // outputnya
        System.out.println("Int ke String : " + Sint); // hasilnya 21
        System.out.println("Byte ke String : " + Sbyte); // hasilnya 13
        System.out.println("Short ke String : " + Sshort); // hasilnya 20
        System.out.println("Long ke String : " + Slong); // hasilnya 5000000
        System.out.println("Double ke String : " + Sdouble); // hasilnya 149.7
        System.out.println("Float ke String : " + Sfloat); // hasilnya 40.6
        System.out.println("Char ke String : " + Schar); // hasilnya Z
        System.out.println("Boolean ke String : " + Sboolean); // hasilnya false

    }
}
