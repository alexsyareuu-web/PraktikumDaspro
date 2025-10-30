import java.util.Scanner;

public class JumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai maksimum n: ");
        int x = sc.nextInt();

        // Perulangan luar: dari 1 sampai n
        for (int n = 1; n <= x; n++) {
            int jumlah = 0; // reset untuk setiap n
            System.out.print("n = " + n + " → jumlah kuadrat = ");

            // Perulangan dalam: menghitung kuadrat dari 1 sampai n
            for (int i = 1; i <= n; i++) {
                jumlah += i * i;
                System.out.print(i * i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlah);
        }
    }
}

