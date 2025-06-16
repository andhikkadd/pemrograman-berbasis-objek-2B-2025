package peminjaman;

public class BukuFiksi implements Peminjaman, Reservasi {
    private String judul;
    private boolean sedangDipinjam = false;

    private static final int MAKS_HARI_PINJAM = 14; 

    public BukuFiksi(String judul) {
        this.judul = judul;
    }

    @Override
    public boolean pinjam(int lamaHari) {
        if (sedangDipinjam) {
            System.out.println("Buku '" + judul + "' sedang dipinjam, tidak bisa dipinjam sekarang.");
            return false;
        }
        if (lamaHari > MAKS_HARI_PINJAM) {
            System.out.println("Buku fiksi maksimal dipinjam " + MAKS_HARI_PINJAM + " hari.");
            return false;
        }
        sedangDipinjam = true;
        System.out.println("Buku fiksi '" + judul + "' berhasil dipinjam selama " + lamaHari + " hari.");
        return true;
    }

    @Override
    public boolean reservasi() {
        if (sedangDipinjam) {
            System.out.println("Buku fiksi '" + judul + "' sedang dipinjam, reservasi berhasil.");
            return true;
        }
        System.out.println("Buku fiksi '" + judul + "' tersedia, tidak perlu reservasi.");
        return false;
    }

    public void kembalikan() {
        sedangDipinjam = false;
        System.out.println("Buku fiksi '" + judul + "' telah dikembalikan.");
    }

    public String getJudul() {
        return judul;
    }
}