package peminjaman;

public class BukuReferensi implements Reservasi {
    private String judul;
    private boolean tersedia = true;

    public BukuReferensi(String judul) {
        this.judul = judul;
    }

    @Override
    public boolean reservasi() {
        if (!tersedia) {
            System.out.println("Buku referensi '" + judul + "' sedang direservasi.");
            return true;
        }
        tersedia = false;
        System.out.println("Buku referensi '" + judul + "' berhasil direservasi.");
        return true;
    }

    public void batalkanReservasi() {
        tersedia = true;
        System.out.println("Reservasi buku referensi '" + judul + "' dibatalkan.");
    }

    @Override
    public String toString() {
        return "BukuReferensi{" +
                "judul='" + judul + '\'' +
                ", tersedia=" + tersedia +
                '}';
    }

    public String getJudul() {
        return judul;
    }
}