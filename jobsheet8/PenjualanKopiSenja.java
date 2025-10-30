import java.util.Scanner;

public class PenjualanKopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jmlCabang = sc.nextInt();

        int totPelangganSemua = 0;
        int totItemSemua = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        // Perulangan untuk setiap cabang
        for (int cabang = 1; cabang <= jmlCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");

            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totItemCabang = 0;

            // Perulangan untuk setiap pelanggan
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int item = sc.nextInt();
                totItemCabang += item;
            }

            // Menampilkan ringkasan per cabang
            System.out.println("Cabang " + cabang + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totItemCabang + " item");

            // Menambahkan ke total keseluruhan
            totPelangganSemua += jumlahPelanggan;
            totItemSemua += totItemCabang;
        }

        // Menampilkan total seluruh cabang
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totPelangganSemua + " orang");
        System.out.println("Item terjual: " + totItemSemua + " item");
    }
}

