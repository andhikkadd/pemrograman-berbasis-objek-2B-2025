package perpustakaan;
import java.util.ArrayList;

public class Perpustakaan {
    ArrayList<BukuFiksi> listBukuFiksi = new ArrayList<>() ;
    ArrayList<BukuNonFiksi> listBukuNonFiksi = new ArrayList<>() ;
    
    public void tambahBukuFiksi(BukuFiksi Buku) {
        listBukuFiksi.add(Buku); 
    }  
    
    public void tambahBukuNonFiksi(BukuNonFiksi Buku) {
        listBukuNonFiksi.add(Buku); 
    }
    
    public void tampilkanKoleksi() {
        System.out.println("=== Daftar Buku Fiksi ===");
        for(BukuFiksi buku : listBukuFiksi) {
            buku.infoFiksi();
        }
        
        System.out.println("=== Daftar Buku Non Fiksi ====");
        for(BukuNonFiksi buku : listBukuNonFiksi) {
            buku.infoNonFiksi();
        } 
    }
}