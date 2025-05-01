public class mainMahasiswa {
    public static void main(String[] args) {
        System.out.println("===Mahasiswa Reguler===");
        MahasiswaReguler reg1 = new MahasiswaReguler("Adiputra Adiroso", "2404411139", "A1");
        MahasiswaReguler reg2 = new MahasiswaReguler("Prabu Siliwangi", "2404411210", "A2");
        
        reg1.infoReguler();
        reg2.infoReguler();
        
        System.out.println("===Mahasiswa Beasiswa===");
        MahasiswaBeasiswa bea1 = new MahasiswaBeasiswa("Rani Maulidia", "2404411728", "KIP");
        MahasiswaBeasiswa bea2 = new MahasiswaBeasiswa("Bintang Alang", "2404411221", "LPDP");
        
        bea1.infoBeasiswa();
        bea2.infoBeasiswa();
    }
}
