import java.util.Scanner;
public class evaluasiMentor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama = "Lestari";
        final String nim = "D021345";
        String programStudi = "INFORMATIKA";
        String alamat = "MAJENE";
        double tb = 149.7;
        float bb = 40.6f;
        int usia = 21;
        long ukt = 5000000;
        char golonganDarah = 'Z';
        boolean keaktifan = false;
        byte jarakRumahkeKampus = 13;
        short jumlahSks = 20;

        System.out.println("NAMA                    : " + nama );
        System.out.println("NIM                     : " + nim);
        System.out.println("PROGRAM STUDI           : " + programStudi);
        System.out.println("ALAMAT                  : " + alamat);
        System.out.println("TINGGI BADAN            : " + tb);
        System.out.println("BERAT BADAN             : " + bb);
        System.out.println("USIA                    : " + usia);
        System.out.println("UKT                     : " + ukt);
        System.out.println("GOLONGAN DARAH          : " + golonganDarah);
        System.out.println("KEAKTIFAN MAHASISWA     : " + keaktifan);
        System.out.println("JARAK RUMAH KE KAMPUS   : " + jarakRumahkeKampus + "km");
        System.out.println("JUMLAH SKS              : " + jumlahSks);
        
        System.out.print("NAMA                    : " );
        nama = sc.nextLine();
        System.out.print("ALAMAT                  : ");
        alamat = sc.nextLine();
        System.out.print("TINGGI BADAN            : " );
        tb = sc.nextDouble();
        System.out.print("JARAK RUMAH KE KAMPUS   : ");
        jarakRumahkeKampus = sc.nextByte();
        System.out.print("GOLONGAN                : ");
        golonganDarah = sc.next().charAt(0);
        
       /* System.out.println("SETELAH DI UPDATE ");
        System.out.println("NAMA                    : " + nama );
        System.out.println("NIM                     : " + nim);
        System.out.println("PROGRAM STUDI           : " + programStudi);
        System.out.println("ALAMAT                  : " + alamat);
        System.out.println("TINGGI BADAN            : " + tb);
        System.out.println("BERAT BADAN             : " + bb);
        System.out.println("USIA                    : " + usia);
        System.out.println("UKT                     : " + ukt);
        System.out.println("GOLONGAN DARAH          : " + golonganDarah);
        System.out.println("KEAKTIFAN MAHASISWA     : " + keaktifan);
        System.out.println("JARAK RUMAH KE KAMPUS   : " + jarakRumahkeKampus + "km");
        System.out.println("JUMLAH SKS              : " + jumlahSks);*/
        
        System.out.println("Nama                        : " + nama +
                            "\nnim                         : " + nim +
                            "\nprodi studi                 : " + programStudi +
                            "\nalamat                      : " + alamat +
                            "\ntinggi badan                : " + tb +
                            "\nberat badan                 : " + bb +
                            "\nusia                        : " + usia +
                            "\nukt                         : " + ukt +
                            "\ngolongan darah              : " + golonganDarah +
                            "\nkeaktifan mahasiswa         : " + keaktifan +
                            "\njarak rumah ke kampus       : "+ jarakRumahkeKampus +
                            "\njumlah sks yang di ambil    : " + jumlahSks);


    }
}
