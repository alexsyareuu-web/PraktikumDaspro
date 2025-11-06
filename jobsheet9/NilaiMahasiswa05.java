package jobsheet9;

import java.util.Scanner;

public class NilaiMahasiswa05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (nilai[i] > max) max = nilai[i];
            if (nilai[i] < min) min = nilai[i];
        }


        double rataRata = (double) total / jumlah;

        
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah : " + min);

        sc.close();
    }
}

    

