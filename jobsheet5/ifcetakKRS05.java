package jobsheet5;
import java.util.Scanner;

public class ifcetakKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak. Silahkan bayar UKT terlebih dahulu";
        System.out.println(pesan);
        
        if (uktLunas){
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi di tolak. Silahkan bayar UKT terlebih dahulu");
        }
    }
}
