package jobsheet9;

import java.util.Scanner;

public class ArrayNilai05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] nilaiAkhir = new int[10];
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print( "masukkan nilai akhir ke-" + (i+1) + ": ");
        nilaiAkhir [i] = sc.nextInt(); 
    }
    System.out.println("Daftar mahasiswa yang lulus (nilai > 70) :");
    for (int i = 0; i < nilaiAkhir.length; i++){
        if (nilaiAkhir [i] < 70){
            System.out.println("nilai akhir ke-" + i + " lulus");
        } 
        
    }
}
}
