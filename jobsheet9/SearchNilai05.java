package jobsheet9;
import java.util.Scanner;
public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Maukkan banyaknya data nilai yang akan diinput: ");
        int jumlh = sc.nextInt();

        int [] arrNilai = new int [jumlh];
        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
            arrNilai [i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang akan dicari: ");
        int key = sc.nextInt();
        
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++){
            if (key == arrNilai [i]){
                hasil = i;
                break;
            }
        } 
        System.out.println();

        if (hasil != -1){
            System.out.println(" Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil +1 ));
        } else {
            System.out.println(" Nilai " + key + " tidak ketemu" );
        }
    }
}
