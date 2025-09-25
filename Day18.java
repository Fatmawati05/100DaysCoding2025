public class Day18 {
    public static void main(String[] args) {
        byte angkaByte = 10;       // tipe data byte
        int angkaInt = angkaByte;  // otomatis jadi int
        long angkaLong = angkaInt; // otomatis jadi long
        float angkaFloat = angkaLong; // otomatis jadi float
        double angkaDouble = angkaFloat; // otomatis jadi double

      // output
      // semua hasilnya 10 tapi float dan double hasilnya 10.0
      // cuman tipe datanya saja yang berubah jadi lebih besar 
        System.out.println("Byte: " + angkaByte);
        System.out.println("Int: " + angkaInt);
        System.out.println("Long: " + angkaLong);
        System.out.println("Float: " + angkaFloat);
        System.out.println("Double: " + angkaDouble);
    }
}
