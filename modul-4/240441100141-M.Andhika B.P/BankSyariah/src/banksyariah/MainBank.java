package banksyariah;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(10); 

        while (true) {
            System.out.print("\nMasukkan nomor rekening: ");
            String noRek = scanner.nextLine();
            
            RekeningBank rekeningNasabah = bank.cariRekening(noRek);

            if (rekeningNasabah == null) { 
                System.out.println("Tidak terdaftar. Membuat rekening baru...");
                System.out.print("Masukkan nama pemilik: ");
                String namaBaru = scanner.nextLine();
                
                rekeningNasabah = new RekeningBank(noRek, namaBaru, 0);
                bank.tambahRekening(rekeningNasabah);
                System.out.println("Rekening berhasil dibuat! Hai " + namaBaru);
            } else {
                System.out.println("Hello " + rekeningNasabah.getNama());
            }
            
            while (true) {
                System.out.println("\nMenu ATM:");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Logout");
                System.out.println("5. Stop");
                System.out.print("Pilih opsi: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda: " + rekeningNasabah.getSaldo());
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah setoran: ");
                        double setoran = scanner.nextDouble();
                        scanner.nextLine();
                        bank.setoran(noRek, setoran);
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah penarikan: ");
                        double penarikan = scanner.nextDouble();
                        scanner.nextLine();
                        bank.penarikan(noRek, penarikan);
                        break;
                    case 4:
                        System.out.println("Logout berhasil! ");
                        break; 
                    case 5:
                        System.out.println("Terima kasih");
                        scanner.close(); 
                        return; 
                    default:
                        System.out.println("Opsi tidak valid");
                }

                if (pilihan == 4) {
                    break;
                }
            }
        }
    }
}
