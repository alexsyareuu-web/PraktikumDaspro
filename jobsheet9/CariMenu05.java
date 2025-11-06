package jobsheet9;

import java.util.Scanner;

public class CariMenu05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };


        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("Menu \"" + cari + "\" tersedia di kafe.");
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia di kafe.");
        }

        sc.close();
    }
}

