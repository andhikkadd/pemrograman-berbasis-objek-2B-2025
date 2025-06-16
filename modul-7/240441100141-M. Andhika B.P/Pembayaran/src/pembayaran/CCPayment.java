package pembayaran;

public class CCPayment implements Payment, Charger {
    @Override
    public double getCharge(double amount) {
        return amount * 0.025;
    }

    @Override
    public double calculateTotal(double amount) {
        double fee = getCharge(amount);
        return amount + fee;
    }

    @Override
    public void pay(double amount) {
        double total = calculateTotal(amount);
        System.out.println("Pembayaran Kartu Kredit:");
        System.out.println("- Total sebelum biaya: Rp" + amount);
        System.out.println("- Biaya admin        : Rp" + getCharge(amount));
        System.out.println("- Total dibayar      : Rp" + total);
    }
}