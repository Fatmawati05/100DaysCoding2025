// Jenis-jenis komentar di Java
// "//"       -> komentar singkat, cuma satu baris
// "/*...*/"  -> komentar agak panjang, bisa lebih dari satu baris
// "/**...*/" -> komentar dokumentasi (Javadoc), biasanya dipake di class atau method

package Fatmawati;

public class Day3 {

    /**
     * Contoh komentar dokumentasi (Javadoc)
     * Biasanya ditulis di atas class, method, atau variabel
     * Fungsinya biar program lebih rapi dan jelas
     * Kalau digenerate pake tool javadoc, bisa otomatis jadi dokumentasi HTML
     */
    public static void main(String[] args) {
        
        // Komentar satu baris
        // Catatan singkat aja, biasanya buat jelasin kode di bawah ini
        System.out.println("Fatmawati"); // Bisa juga komen di ujung baris

        /* Komentar banyak baris
           Dipake kalau penjelasannya agak panjang
           Misalnya mau jelasin logika program biar gampang dipahami
           Bisa juga buat nonaktifin beberapa baris kode pas lagi nge-debug
        */
    }
}
