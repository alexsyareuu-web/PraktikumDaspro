package jobsheet6;

import java.util.Scanner;

public class penilaianUtsUas05 {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("===== Input Nilai Akhir =====");
    System.out.print("NAMA\t :");
    String Nama = sc.nextLine();
    System.out.print("NIM\t :");
    String NIM = sc.nextLine();

    System.out.println("\n--- Matkul Algoritman dan Pemogran ---");
    System.out.print("Nilai UTS\t :");
    int nilaiUTS = sc.nextInt();
    System.out.print("Nilai UAS\t :");
    int nilaiUAS = sc.nextInt();
    System.out.print("Nilai Tugas\t :");
    int nilaiTugas = sc.nextInt();

    System.out.println("\n--- Matkul Struktur Data ---");
    System.out.print("Nilai UTS\t :");
    int nilaiUTS2 = sc.nextInt();
    System.out.print("Nilai UAS\t :");
    int nilaiUAS2 = sc.nextInt();
    System.out.print("Nilai Tugas\t :");
    int nilaiTugas2 = sc.nextInt();

    System.out.println("===== HASIL PENILAIN AKADEMIK =====");
    System.out.println("Nama : " + Nama);
    System.out.println("NIM : " + NIM);
    
    double NilaiAP = (nilaiUTS * 0.3) + (nilaiUAS * 0.4) + (nilaiTugas * 0.3);
    String NilaiHurufAP = "";
    if (NilaiAP >= 80 && NilaiAP <= 100) {
        NilaiHurufAP = "A";
    } else if (NilaiAP >= 73 && NilaiAP < 80) {
        NilaiHurufAP = "B+";
    } else if (NilaiAP >= 65 && NilaiAP < 73) {
        NilaiHurufAP = "B";
    } else if (NilaiAP >= 60 && NilaiAP < 65) {
        NilaiHurufAP = "C+";
    } else if (NilaiAP>= 50 && NilaiAP < 60) {
        NilaiHurufAP = "C";
    } else if (NilaiAP >= 39 && NilaiAP < 50) {
        NilaiHurufAP = "D";
    } else if (NilaiAP < 39) {
        NilaiHurufAP = "E";
    }
    
    double NilaiSD = (nilaiUTS2 * 0.3) + (nilaiUAS2 * 0.4) + (nilaiTugas2 * 0.3);
    String NilaiHurufSD = "";
    if (NilaiSD >= 80 && NilaiSD <= 100) {
        NilaiHurufSD = "A";
    } else if (NilaiSD >= 73 && NilaiSD < 80) {
        NilaiHurufSD = "B+";
    } else if (NilaiSD >= 65 && NilaiSD < 73) {
        NilaiHurufSD = "B";
    } else if (NilaiSD >= 60 && NilaiSD < 65) {
        NilaiHurufSD = "C+";
    } else if (NilaiSD >= 50 && NilaiSD < 60) {
        NilaiHurufSD = "C";
    } else if (NilaiSD >= 39 && NilaiSD < 50) {
        NilaiHurufSD = "D";
    } else if (NilaiSD < 39) {
        NilaiHurufSD = "E";
    }

    String StatusAP = "";
    if (NilaiAP >= 60) {
        StatusAP = "LULUS";
    } else {
        StatusAP = "TIDAK LULUS";
    }

    String StatusSD = "";
    if (NilaiSD >= 65) { 
        StatusSD = "LULUS";
    } else {
        StatusSD = "TIDAK LULUS";
    }
    
    System.out.println("\n Matkul\t\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
    System.out.println("--------------------------------------------------------");
    System.out.println("Algoritma Pemrograman\t\t\t" + nilaiUTS + "\t" + nilaiUAS + "\t" + nilaiTugas + "\t" + NilaiAP + "\t\t" + NilaiHurufAP + "\t" + StatusAP);
    System.out.println("Struktur Data\t\t\t\t" + nilaiUTS2 + "\t" + nilaiUAS2 + "\t" + nilaiTugas2 + "\t" + NilaiSD + "\t\t" + NilaiHurufSD + "\t" + StatusSD+ "\t");
    
    double RataRata = (NilaiAP + NilaiSD) /2;

    String StatusSemester = "";
    if (RataRata >= 75) {
        StatusSemester = "LULUS";
    } else {
        StatusSemester = "TIDAK LULUS";
    }
    
    System.out.println("\nRataRata Nilai AKHIR : " + RataRata);
    System.out.println("Status Semester : " + StatusSemester);

    }
}
