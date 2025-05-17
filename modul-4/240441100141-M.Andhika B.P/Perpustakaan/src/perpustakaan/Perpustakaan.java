package perpustakaan;
import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' telah ditambahkan ke perpustakaan.");
    }

    public void tampilkanDaftarBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan masih kosong.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
            }
        }
    }
}
