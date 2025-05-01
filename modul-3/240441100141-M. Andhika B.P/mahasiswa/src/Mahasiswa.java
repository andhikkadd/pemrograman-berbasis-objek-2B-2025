public class Mahasiswa {
    String nama;
    String nim;
    
    public Mahasiswa(String na, String ni) {
        nama = na;
        nim = ni; 
    }
    
    public void infoMahasiswa() {
            System.out.println("Nama: " + nama);
            System.out.println("Nim: " + nim);
    }
}