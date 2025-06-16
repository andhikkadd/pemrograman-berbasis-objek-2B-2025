package peminjaman;

public class Main {
    public static void main(String[] args) {
        Perpustakaan sistem = new Perpustakaan();

        BukuFiksi fiksi1 = new BukuFiksi("Laskar Pelangi");
        BukuFiksi fiksi2 = new BukuFiksi("Bumi");
        BukuReferensi ref1 = new BukuReferensi("Kamus Besar Bahasa Indonesia");
        BukuReferensi ref2 = new BukuReferensi("Ensiklopedi Dunia");

        sistem.pinjamBukuFiksi(fiksi1, 10);  
        sistem.pinjamBukuFiksi(fiksi1, 5);    
        sistem.pinjamBukuFiksi(fiksi2, 20);   
        System.out.println("");

        
        sistem.kembalikanBukuFiksi(fiksi1);
        sistem.pinjamBukuFiksi(fiksi1, 7);  
        System.out.println("");

        sistem.reservasiBukuReferensi(ref1);
        sistem.reservasiBukuReferensi(ref2);
        System.out.println("");

        sistem.batalkanReservasiBukuReferensi(ref2);
    }
}