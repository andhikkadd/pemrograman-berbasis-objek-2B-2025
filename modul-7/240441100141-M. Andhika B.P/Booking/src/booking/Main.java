package booking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Booking Kendaraan ===");

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        System.out.print("Pilih kendaraan yang ingin dibooking: \n1. Mobil\n2. Motor\n3. Sepeda\nPilihan: ");
        int pilihanKendaraan = scanner.nextInt();

        System.out.print("Masukkan durasi booking dalam jam: ");
        int jam = scanner.nextInt();

        Booking booking = null;

        switch (pilihanKendaraan) {
            case 1:
                booking = new Mobil();
                break;
            case 2:
                booking = new Motor();
                break;
            case 3:
                booking = new Sepeda();
                break;
            default:
                System.out.println("Pilihan kendaraan tidak valid.");
                System.exit(0);
        }

        System.out.println("\n--- Proses Booking ---");
        boolean sukses = booking.booking(usia, jam);

        if (sukses) {
            System.out.println("Booking selesai. Terima kasih.");
        } else {
            System.out.println("Booking gagal. Mohon coba lagi.");
        }

        scanner.close();
    }
}