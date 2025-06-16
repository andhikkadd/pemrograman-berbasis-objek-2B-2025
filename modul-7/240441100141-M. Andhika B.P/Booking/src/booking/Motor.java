package booking;

public class Motor implements Booking, Asuransi {
    private static final int USIA_MINIMAL = 17;
    private double tarifPerJam = 50_000;

    @Override
    public double biayaAsuransi(int jam) {
        return 0.07 * tarifPerJam * jam;
    }

    @Override
    public double hitungBiaya(int jam) {
        double dasar = tarifPerJam * jam;
        double asuransi = biayaAsuransi(jam);
        return dasar + asuransi;
    }

    @Override
    public boolean booking(int usiaPengguna, int jam) {
        if (usiaPengguna < USIA_MINIMAL) {
            System.out.println("Booking gagal: Usia minimal " + USIA_MINIMAL + " tahun untuk motor.");
            return false;
        }
        System.out.println("Booking motor berhasil.");
        System.out.println("Durasi: " + jam + " jam");
        System.out.println("Biaya rental: Rp" + (tarifPerJam * jam));
        System.out.println("Biaya asuransi: Rp" + biayaAsuransi(jam));
        System.out.println("Total biaya: Rp" + hitungBiaya(jam));
        return true;
    }
}