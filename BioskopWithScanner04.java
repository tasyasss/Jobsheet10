package Jobsheet10;
import java.util.Scanner;
import java.util.Arrays;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String [4][2];
        String nama, nextPenonton, nextMenu;
        int baris, kolom, menu;

        // while (true) {
        //     System.out.print("Masukkan nama : ");
        //     nama = sc.nextLine();
        //     System.out.print("Masukkan baris: ");
        //     baris = sc.nextInt();
        //     System.out.print("Masukkan kolom: ");
        //     kolom = sc.nextInt();
        //     sc.nextLine();

        //     penonton[baris-1][kolom-1] = nama;

        //     System.out.print("Input penonton lainnya? (y/n): ");
        //     nextPenonton = sc.nextLine();
            
        //     if (nextPenonton.equalsIgnoreCase("n")) {
        //         break;
        //     }
        // }

        do {
            System.out.println("------ Menu Bioskop ------");
            System.out.println("1. Input data Penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            menu = sc.nextInt();

            // input data penonton
            if (menu == 1) {
                while (true) {
                    System.out.println("");
                    System.out.println("------ Pilih Kursi Bioskop ------");
                    System.out.print("Masukkan nama : ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    while(penonton[baris-1][kolom-1] != null) {
                        System.out.println("Mohon maaf kursi telah terisi");
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                    } 
                    penonton[baris-1][kolom-1] = nama;
                    
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    nextPenonton = sc.next();

                    if (nextPenonton.equalsIgnoreCase("n")) {
                        break;
                    }    
                }
            } 
            // tampilkan daftar penonton
            else if (menu == 2) {
                String bintang = "***";
                System.out.println("");
                System.out.println("------ List Penonton Bioskop ------");
                for (int i = 0; i < penonton.length; i++) {
                    // mengubah null ke bintang ***
                    for (int j = 0; j < penonton[i].length; j++) {
                        if(penonton[i][j] == null) {
                            penonton[i][j] = bintang;
                        } 
                    }
                    
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
            }
            else if(menu == 3){
                break;
            } else {
                System.out.println("Invalid");
            }

            System.out.println("");
            System.out.print("Proses ke menu lainnya? (y/n): ");
            nextMenu = sc.next();
            System.out.println("");

            if (nextMenu.equalsIgnoreCase("n")) {
                break;
            }

        } while (menu != 3);

        sc.close();
    }
}
