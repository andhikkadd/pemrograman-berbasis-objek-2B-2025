package pembayaran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah pembayaran (Rp): ");
        double amount = in.nextDouble();

        System.out.println("======= Menu =======:");
        System.out.println("1. Tunai (Cash)");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("Pilih metode pembayaran[1/2/3]: ");

        int opt = in.nextInt();

        Payment payment = null;
        switch(opt) {
            case 1:
                payment = new CashPayment();
                break;
            case 2:
                payment = new CCPayment();
                break;
            case 3:
                payment = new EwalletPayment();
                break;
            default:
                System.out.println("Metode pembayaran tidak valid.");
                System.exit(0);
        }
        System.out.println("\n--- Struk Pembayaran ---");
        payment.pay(amount);
        System.out.println("\nTerima kasih telah bertransaksi!");
    }
}