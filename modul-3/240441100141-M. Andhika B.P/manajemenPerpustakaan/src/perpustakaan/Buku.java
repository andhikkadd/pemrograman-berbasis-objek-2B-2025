package perpustakaan;

public class Buku {
    String judul;
    String penulis;
    
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
    
    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);   
    }
}