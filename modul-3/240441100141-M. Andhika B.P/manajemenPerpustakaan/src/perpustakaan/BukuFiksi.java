package perpustakaan;

public class BukuFiksi extends Buku {
    String genre;

    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infoFiksi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Genre: " + genre);
        System.out.println("");
    }
}