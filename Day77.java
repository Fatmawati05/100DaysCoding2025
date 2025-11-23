public class Day77 {
    public static void main(String[] args) {
        String teks = "  Belajar Java  ";

        // substring()
        String sub = teks.substring(2, 9);

        // replace()
        String ganti = teks.replace("Java", "Coding");

        // trim()
        String rapih = teks.trim();

        System.out.println("Teks asli     : \"" + teks + "\"");
        System.out.println("substring()   : " + sub);
        System.out.println("replace()     : " + ganti);
        System.out.println("trim()        : " + rapih);
    }
}
