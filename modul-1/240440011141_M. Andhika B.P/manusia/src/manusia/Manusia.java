package manusia;

public class Manusia {    
    String nama;
    int umur;
    String alamat;
    
    public Manusia (String n, int u, String a){
        nama = n;
        umur = u;
        alamat = a;
    }
    
    void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari() {
        System.out.println(nama + " sedang berlari");
    }
    
    void tampilkanInfo() {
        System.out.println("-----------------------");
        System.out.println("nama :"+ nama);
        System.out.println("umur :"+ umur);
        System.out.println("alamat :"+ alamat);
    }
    
    public static void main(String[] args) {
        Manusia orang1 = new Manusia("Cecep", 12, "Sampang");
        Manusia orang2 = new Manusia("Burhan", 33, "Jepara");
        Manusia orang3 = new Manusia("Muhaimin", 28, "Blega");
        Manusia orang4 = new Manusia("Nor", 22, "Surabaya");
        Manusia orang5 = new Manusia("Yayan", 27, "Sumenep");
        
        orang1.tampilkanInfo();
        orang1.berjalan();
        orang1.berlari();
        orang2.tampilkanInfo();
        orang2.berjalan();
        orang2.berlari();
        orang3.tampilkanInfo();
        orang3.berjalan();
        orang3.berlari();
        orang4.tampilkanInfo();
        orang4.berjalan();
        orang4.berlari();
        orang5.tampilkanInfo();
        orang5.berjalan();
        orang5.berlari();
    }   
}