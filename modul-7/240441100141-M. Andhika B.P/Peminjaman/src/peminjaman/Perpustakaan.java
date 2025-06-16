package peminjaman;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<BukuFiksi> daftarPeminjamanFiksi = new ArrayList<>();
    private List<BukuReferensi> daftarReservasiReferensi = new ArrayList<>();

    public void pinjamBukuFiksi(BukuFiksi buku, int lamaHari) {
        if (buku.pinjam(lamaHari)) {
            daftarPeminjamanFiksi.add(buku);
        }
    }

    public void kembalikanBukuFiksi(BukuFiksi buku) {
        if (daftarPeminjamanFiksi.remove(buku)) {
            buku.kembalikan();
        } else {
            System.out.println("Buku tidak ditemukan dalam daftar peminjaman.");
        }
    }

    public void reservasiBukuReferensi(BukuReferensi buku) {
        if (buku.reservasi()) {
            daftarReservasiReferensi.add(buku);
        }
    }

    public void batalkanReservasiBukuReferensi(BukuReferensi buku) {
        if (daftarReservasiReferensi.remove(buku)) {
            buku.batalkanReservasi();
        } else {
            System.out.println("Buku referensi tidak ditemukan dalam daftar reservasi.");
        }
    }
}