package pembayaran;

public interface Payment {
    double calculateTotal(double amount);
    void pay(double amount);
}
  