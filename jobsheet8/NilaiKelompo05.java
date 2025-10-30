import java.util.Scanner;
public class NilaiKelompo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai;
        float totalNilai, rataRata, rataRatatinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("\nNilai Kelompok " + i);
            
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            
            rataRata = totalNilai / 5;
            if (rataRata > rataRatatinggi) {
                rataRatatinggi = rataRata;
            }
            System.out.println("Rata-rata Nilai Kelompok " + i + ": " + rataRata);
            i++;
        }
        System.out.println("\n Rata-rata Nilai Tertinggi: " + rataRatatinggi);
    }
}
