package mahasiswaapp;

public class Kampus {
    String nama;
    String alamat;

    public Kampus(String nama, String alamat) {
        if (!isValidNama(nama)) {               
            throw new IllegalArgumentException("Nama kampus tidak valid (tidak boleh mengandung angka).");
        }
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfoKampus() {
        System.out.println("Nama Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }

    public static boolean isValidNama(String nama) {
        return !nama.matches(".*\\d.*");
    }
}
