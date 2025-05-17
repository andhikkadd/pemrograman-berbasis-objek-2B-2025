package perpustakaan;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        Buku buku1 = new Buku("Legenda Malin Kundang", "Cecep Marfuah", 80);
        Buku buku2 = new Buku("Teori Relativitas", "Ucup Hamburger", 250);
        Buku buku3 = new Buku("Kisah Cinta Free Fire", "Ahmad Soleh", 110);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        perpustakaan.tampilkanDaftarBuku();
    }
}
