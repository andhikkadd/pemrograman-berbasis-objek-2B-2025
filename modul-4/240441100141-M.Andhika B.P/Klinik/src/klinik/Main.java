package klinik;

public class Main {
    public static void main(String[] args) {
        Klinik klinik = new Klinik(5); 

        klinik.tambahPasien(new Pasien("Fausul Oleng", 22, "Demam"));
        klinik.tambahPasien(new Pasien("Sole Aselole", 30, "Batuk"));
        klinik.tambahPasien(new Pasien("Ahmad fufa", 25, "Sakit Pinggang"));

        klinik.tampilkanPasien();
    }
}