package pembayaran;

public class EwalletPayment implements Payment, Diskon {
    @Override
    public double getDiscount(double amount) {
        if (amount > 50_000) {
            return 10_000;
        }
        return 0;
    }

    @Override
    public double calculateTotal(double amount) {
        double discount = getDiscount(amount);
        return amount - discount;
    }

    @Override
    public void pay(double amount) {
        double total = calculateTotal(amount);
        System.out.println("Pembayaran E-Wallet:");
        System.out.println("- Total sebelum diskon: Rp" + amount);
        System.out.println("- Promo E-Wallet      : Rp" + getDiscount(amount));
        System.out.println("- Total dibayar       : Rp" + total);
    }
}