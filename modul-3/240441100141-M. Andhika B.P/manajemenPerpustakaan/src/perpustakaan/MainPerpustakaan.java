package perpustakaan;
import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        for (int i=0; i<4; i++) {
            System.out.println("Pilih jenis buku");
            System.out.println("1. Buku Fiksi");
            System.out.println("2. Buku Non Fiksi");
            System.out.print("Masukkan Pilihan[1/2]: ");
            while (!input.hasNextInt()) { 
                System.out.println("Tidak Valid! Silakan masukkan angka");
                input.next();
                System.out.print("Masukkan Pilihan [1/2]: ");
            }
            int pilihan = input.nextInt();
            input.nextLine();
            
            if (pilihan == 1) {
                System.out.print("Masukkan judul buku: ");
                String judul = input.nextLine();
                System.out.print("Masukkan penulis buku: ");
                String penulis = input.nextLine();
                System.out.print("Masukkan genre buku: ");
                String genre = input.nextLine();
                
                BukuFiksi buku = new BukuFiksi(judul, penulis, genre);
                perpustakaan.tambahBukuFiksi(buku);
                
            } else if (pilihan == 2) {
                System.out.print("Masukkan judul buku: ");
                String judul = input.nextLine();
                System.out.print("Masukkan penulis buku: ");
                String penulis = input.nextLine();
                System.out.print("Masukkan topik buku: ");
                String topik = input.nextLine();
                
                BukuNonFiksi buku = new BukuNonFiksi(judul, penulis, topik);
                perpustakaan.tambahBukuNonFiksi(buku);
              
            } else {
                System.out.println("Pilihan tidak valid");
                i--;
            }
        }
        System.out.println("");
        perpustakaan.tampilkanKoleksi();
        input.close();
    }
}