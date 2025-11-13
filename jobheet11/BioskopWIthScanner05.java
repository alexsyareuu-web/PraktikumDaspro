package jobheet11;
import java.util.Scanner;

public class BioskopWIthScanner05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int baris = 4;
        int kolom = 2;
        String nama, next;
        String [][] penonton = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton [baris-1][kolom-1] = nama;
            System.out.print("Tambah data lagi? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
            
        }

        
    }
    
}
