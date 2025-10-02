package jobsheet5;

import java.util.Scanner;

public class WifiAksesKampus05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Sistem Akses WIFI ---");
        System.out.print("Apakah Anda Mahasiswa aktif? (ya/tidak): ");
        String mahasiswaAktif = sc.nextLine().trim();

        if (mahasiswaAktif.equalsIgnoreCase("ya")) {
            System.out.print("Anda Mahasiswa aktif. Silakan masukkan password WIFI kampus: ");
            String passwordWifi = sc.nextLine().trim();
            
            if (passwordWifi.equals("wifi123")) {
                pesan = "Password benar. Anda berhasil mengakses WIFI kampus.";
            } else {
                pesan = "Password salah. Akses ditolak.";
            }
        } else {
            pesan = "Anda bukan mahasiswa aktif. Akses WIFI ditolak.";
        }

        System.out.println(pesan);
        sc.close();
    }
}
