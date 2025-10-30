import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal ");
            return;
        }

        // Loop baris
        for (int i = 1; i <= n; i++) {
            // Loop kolom
            for (int j = 1; j <= n; j++) {
                // Jika di tepi atas, bawah, kiri, atau kanan
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  "); // spasi di bagian tengah
                }
            }
            System.out.println(); // pindah ke baris baru
        }
    }
}
