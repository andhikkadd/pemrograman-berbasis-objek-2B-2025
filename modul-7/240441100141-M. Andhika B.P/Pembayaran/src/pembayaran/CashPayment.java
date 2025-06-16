package pembayaran;

public class CashPayment implements Payment, Diskon {
    public double getDiscount(double amount) {
        if (amount > 100_000) {
            return amount * 0.05;
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
        System.out.println("Pembayaran Tunai:");
        System.out.println("- Total sebelum diskon: Rp" + amount);
        System.out.println("- Diskon           : Rp" + getDiscount(amount));
        System.out.println("- Total dibayar    : Rp" + total);
    }
}