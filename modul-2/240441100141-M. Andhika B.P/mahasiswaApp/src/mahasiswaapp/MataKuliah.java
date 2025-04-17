package mahasiswaapp;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!isValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid. Harus 2 atau 3.");
        }
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public static boolean isValidSKS(int sks) { //method static
        return sks == 2 || sks == 3;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
