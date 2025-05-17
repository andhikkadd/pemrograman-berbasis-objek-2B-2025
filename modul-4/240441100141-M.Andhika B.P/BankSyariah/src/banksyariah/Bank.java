package banksyariah;

public class Bank {
    private RekeningBank[] daftarRekening;
    private int jumlahRekening; 

    public Bank(int kapasitas) {
        daftarRekening = new RekeningBank[kapasitas];
        jumlahRekening = 0;
    }

    public void tambahRekening(RekeningBank rekeningBaru) {
        if (jumlahRekening < daftarRekening.length) {
            daftarRekening[jumlahRekening] = rekeningBaru;
            jumlahRekening++;
        } else {
            System.out.println("Bank sudah penuh, tidak bisa menambah rekening baru!");
        }
    }

    RekeningBank cariRekening(String noRek) {
        for (int i = 0; i < jumlahRekening; i++) {
            if (daftarRekening[i].getNorek().equals(noRek)) {
                return daftarRekening[i];
            }
        }
        return null;
    }

    public void setoran(String noRek, double jumlah) {
        RekeningBank rekening = cariRekening(noRek);
        if (rekening != null) {
            rekening.setSaldo(rekening.getSaldo() + jumlah);
            System.out.println("Setoran sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    public void penarikan(String noRek, double jumlah) {
        RekeningBank rekening = cariRekening(noRek);
        if (rekening != null) {
            if (rekening.getSaldo() >= jumlah) {
                rekening.setSaldo(rekening.getSaldo() - jumlah);
                System.out.println("Penarikan sebesar " + jumlah + " berhasil.");
            } else {
                System.out.println("Saldo tidak mencukupi!");
            }
        } else {
            System.out.println("Rekening tidak ditemukan!");
        }
    }

    public void tampilkanSemuaRekening() {
        System.out.println("Daftar Rekening:");
        for (int i = 0; i < jumlahRekening; i++) {
            System.out.println("No Rek: " + daftarRekening[i].getNorek() +
                               ", Nama: " + daftarRekening[i].getNama() +
                               ", Saldo: " + daftarRekening[i].getSaldo());
        }
    }
}
