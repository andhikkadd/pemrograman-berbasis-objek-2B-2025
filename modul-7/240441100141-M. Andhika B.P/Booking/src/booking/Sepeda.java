package booking;

public class Sepeda implements Booking {
    private static final int USIA_MINIMAL = 12; 
    private double tarifPerJam = 10_000; 

    @Override
    public double hitungBiaya(int jam) {
        return tarifPerJam * jam;
    }

    @Override
    public boolean booking(int usiaPengguna, int jam) {
        if (usiaPengguna < USIA_MINIMAL) {
            System.out.println("Booking gagal: Usia minimal " + USIA_MINIMAL + " tahun untuk sepeda.");
            return false;
        }
        System.out.println("Booking sepeda berhasil.");
        System.out.println("Durasi: " + jam + " jam");
        System.out.println("Total biaya: Rp" + hitungBiaya(jam));
        return true;
    }
}