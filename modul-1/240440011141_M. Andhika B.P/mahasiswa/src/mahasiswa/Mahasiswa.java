package mahasiswa;

import java.util.Scanner;

class DataMahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;

    public DataMahasiswa(String na, String ni, String ju, String al) {
        nama = na;
        nim = ni;
        jurusan = ju;
        alamat = al;
    }

    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Alamat  : " + alamat);
        System.out.println("----------------------------");
    }
}

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa pertama:");
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim1 = scanner.nextLine();
        System.out.print("Jurusan: ");
        String jurusan1 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = scanner.nextLine();
        DataMahasiswa mahasiswa1 = new DataMahasiswa(nama1, nim1, jurusan1, alamat1);
        System.out.println();

        System.out.println("Masukkan data mahasiswa kedua:");
        System.out.print("Nama: ");
        String nama2 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim2 = scanner.nextLine();
        System.out.print("Jurusan: ");
        String jurusan2 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = scanner.nextLine();
        DataMahasiswa mahasiswa2 = new DataMahasiswa(nama2, nim2, jurusan2, alamat2);
        System.out.println();

        System.out.println("Masukkan data mahasiswa ketiga:");
        System.out.print("Nama: ");
        String nama3 = scanner.nextLine();
        System.out.print("NIM: ");
        String nim3 = scanner.nextLine();
        System.out.print("Jurusan: ");  
        String jurusan3 = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = scanner.nextLine();
        DataMahasiswa mahasiswa3 = new DataMahasiswa(nama3, nim3, jurusan3, alamat3);
        System.out.println();

        System.out.println("=== Daftar Mahasiswa ===");
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
     
        scanner.close();
    }
}
