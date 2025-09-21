public class Day14 {
    public static void main(String[] args) {
        String sByte = "13";
        String sShort = "20";
        String sInt = "21";
        String sLong = "5000000";
        String sFloat = "40.6f";
        String sDouble = "149.7";
        String sChar = "P";
        String sBoolean = "true";

        // konversi String ke tipe data primitif
        byte hasilByte = Byte.parseByte(sByte);
        short hasilShort = Short.parseShort(sShort);
        int hasilInt = Integer.parseInt(sInt);
        long hasilLong = Long.parseLong(sLong);
        float hasilFloat = Float.parseFloat(sFloat);
        double hasilDouble = Double.parseDouble(sDouble);
        char hasilChar = sChar.charAt(0); // char beda harus pakai charAt(0), tidak ada Character.parseChar()
        boolean hasilBoolean = Boolean.parseBoolean(sBoolean);

        //output
        System.out.println("Byte : " + hasilByte);
        System.out.println("Short : " + hasilShort);
        System.out.println("Int : " + hasilInt);
        System.out.println("Long : " + hasilLong);
        System.out.println("Float : " + hasilFloat);
        System.out.println("Double : " + hasilDouble);
        System.out.println("Char : " + hasilChar); 
        System.out.println("Boolean : " + hasilBoolean);
    }
}
