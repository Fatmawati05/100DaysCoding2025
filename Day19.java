public class Day19 {
    public static void main(String[] args) {
        double d = 300.99;
        float f = (float) d;   // paksa ke float, pecahan tetap
        int i = (int) f;       // paksa ke int, pecahan hilang
        byte b = (byte) i;     // paksa ke byte, overflow

        System.out.println("Double: " + d); // hasilnya 300.99
        System.out.println("Float: " + f);  // hasilnya 300.99
        System.out.println("Int: " + i);    // hasilnya 300
        System.out.println("Byte: " + b);   // 44 overflow karena byte cuma -128 s/d 127 → 44
    }
}
