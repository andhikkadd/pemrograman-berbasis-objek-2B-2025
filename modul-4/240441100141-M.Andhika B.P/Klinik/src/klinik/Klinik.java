package klinik;

class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;

    public Klinik(int kapasitas) {
        daftarPasien = new Pasien[kapasitas];
        jumlahPasien = 0;
    }
 
    public void tambahPasien(Pasien pasien) {
        if (jumlahPasien < daftarPasien.length) {
            daftarPasien[jumlahPasien] = pasien;
            jumlahPasien++;
        } else {
            System.out.println("Kapasitas Klinik penuh, tidak bisa menambah pasien.");
        }
    }

  
    public void tampilkanPasien() {
        System.out.println("Daftar Pasien:");
        for (int i = 0; i < jumlahPasien; i++) {
            daftarPasien[i].displayInfo();
        }
    }
}
