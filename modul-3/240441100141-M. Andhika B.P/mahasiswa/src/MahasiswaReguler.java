public class MahasiswaReguler extends Mahasiswa {
    String kelas;
    
    public MahasiswaReguler(String na, String ni, String kl) {
        super(na, ni);
        kelas = kl;
    }
    
    public void infoReguler() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("");
    } 
}