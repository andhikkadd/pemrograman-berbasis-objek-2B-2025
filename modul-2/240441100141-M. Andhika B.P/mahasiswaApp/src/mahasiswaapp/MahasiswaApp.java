package mahasiswaapp;

public class MahasiswaApp {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Trunojoyo", "Jl. Gugugaga No.1");

        MataKuliah mk1 = new MataKuliah("MK001", "Pemrograman Berbasis Objek", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Keterampilan Intepersonal", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Analisa Proses Bisnis", 3);
        MataKuliah mk4 = new MataKuliah("MK004", "Algoritma Pemrograman", 2);
        MataKuliah mk5 = new MataKuliah("MK005", "Kewarganegaraan", 3);
        MataKuliah mk6 = new MataKuliah("MK006", "Desain Manajemen Jaringan", 3);
        MataKuliah mk7 = new MataKuliah("MK007", "Statistik dan Probabilitas", 2);
        MataKuliah mk8 = new MataKuliah("MK008", "Pemrograman Berbasis Web", 3);

        Mahasiswa m1 = new Mahasiswa("Sued", "2312345678", "Sistem Informasi");
        m1.tambahMataKuliah(mk1);
        m1.tambahMataKuliah(mk2);
        m1.tambahMataKuliah(mk3);
        m1.tambahMataKuliah(mk4);

        Mahasiswa m2 = new Mahasiswa("Cecep", "2312345679", "Sistem Informasi");
        m2.tambahMataKuliah(mk1);
        m2.tambahMataKuliah(mk5);
        m2.tambahMataKuliah(mk6);
        m2.tambahMataKuliah(mk2);

        Mahasiswa m3 = new Mahasiswa("Fulan", "2312345680", "Teknik Informatika");
        m3.tambahMataKuliah(mk3);
        m3.tambahMataKuliah(mk4);
        m3.tambahMataKuliah(mk7);
        m3.tambahMataKuliah(mk8);

        Mahasiswa m4 = new Mahasiswa("Tayo", "2312345681", "Teknik Informatika");
        m4.tambahMataKuliah(mk2);
        m4.tambahMataKuliah(mk3);
        m4.tambahMataKuliah(mk5);
        m4.tambahMataKuliah(mk6);

        Mahasiswa m5 = new Mahasiswa("Marfuah", "2312345682", "Sistem Informasi");
        m5.tambahMataKuliah(mk1);
        m5.tambahMataKuliah(mk4);
        m5.tambahMataKuliah(mk7);
        m5.tambahMataKuliah(mk8);

        Mahasiswa m6 = new Mahasiswa("Faiz", "2312345683", "Teknik Informatika");
        m6.tambahMataKuliah(mk2);
        m6.tambahMataKuliah(mk5);
        m6.tambahMataKuliah(mk6);
        m6.tambahMataKuliah(mk8);

        m1.tampilkanBiodata();
        m2.tampilkanBiodata();
        m3.tampilkanBiodata();
        m4.tampilkanBiodata();
        m5.tampilkanBiodata();
        m6.tampilkanBiodata();

        kampus.tampilkanInfoKampus();
    }
}
