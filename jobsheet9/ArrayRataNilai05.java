package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs = new int [10];
        double total = 0;
        double rataRata;
        int jmllulus = 0;
        int jmltidaklulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs [i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs [i];
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs [i] >= 70){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs [i] + " Lulus");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs [i] + " Tidak Lulus");
            }

        }
        rataRata = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai : " + rataRata);
    }
}
