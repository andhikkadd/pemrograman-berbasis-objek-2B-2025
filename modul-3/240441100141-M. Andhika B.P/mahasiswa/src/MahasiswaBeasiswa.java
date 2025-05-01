public class MahasiswaBeasiswa extends Mahasiswa {
    String jenisBeasiswa;

    public MahasiswaBeasiswa(String na, String ni, String je) {
        super(na, ni);
        jenisBeasiswa = je;        
    }
    
    public void  infoBeasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("");
    }   
}