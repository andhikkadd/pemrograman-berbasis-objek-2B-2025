package banksyariah;

public class RekeningBank {
    private String nomerRekening;
    private String namaPemilik;
    private double saldo;
    
    public RekeningBank(String nomerRekening, String namaPemilik, double saldo) {
        this.nomerRekening = nomerRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    // Getter 
    public String getNorek() {
        return nomerRekening;
    }
    
    public String getNama() {
        return namaPemilik;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    //setter
    public void setNorek(String nomerRekening) {
        if (nomerRekening.matches("[0-9]+")) {
            this.nomerRekening = nomerRekening; 
        } else {
            System.out.println("Nomer Rekening Tidak Valid!");
        }
    }
    
    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik.trim().isEmpty()) {
            this.namaPemilik = namaPemilik;
        } else {
            System.out.println("Nama Pemilik Tidak Valid");
        }
    }
    
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak bisa negatif");
        }
    } 
}