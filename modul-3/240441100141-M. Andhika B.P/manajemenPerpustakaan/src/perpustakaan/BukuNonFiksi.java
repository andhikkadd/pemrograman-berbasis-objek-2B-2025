package perpustakaan;

public class BukuNonFiksi extends Buku {
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }
    
    public void infoNonFiksi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Topik: " + topik);
        System.out.println("");
    }
}