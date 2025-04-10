package hewan;

class Kucing {
    String nama;
    String warna;
    int umur;

    Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    void bersuara() {
        System.out.println(nama + " mengeong");
    }
    
    void info() {
        System.out.println("Nama: "+ nama + " Warna: "+ warna + " Umur: "+ umur);
    } 
}

class Ikan {
    String nama;
    String jenis;
    int umur;

    Ikan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    void berenang() {
        System.out.println(nama + " berenang");
    }
    
    void info() {
        System.out.println("Nama: "+ nama + " Jenis: "+ jenis + " Umur: "+ umur);
    }
}

class Burung {
    String nama;
    String warna;
    int umur;

    Burung(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    void terbang() {
        System.out.println(nama + " terbang tinggi di udara");
    }
    
    void info() {
        System.out.println("Nama: "+ nama + " Warna: "+ warna + " Umur: "+ umur);
    }
}

public class Hewan {
    public static void main(String[] args) {
        Kucing[] kucingArray = new Kucing[3];
        Ikan[] ikanArray = new Ikan[3];
        Burung[] burungArray = new Burung[3];
        
        for (int i = 0; i < 3; i++) {
            kucingArray[i] = new Kucing("Kucing_" + (i+1), "Putih", i+1);
            ikanArray[i] = new Ikan("Ikan_" + (i+1), "Koi", i+2);
            burungArray[i] = new Burung("Burung_" + (i+1), "Hijau", i+3);
        }

        for (int i = 0; i < 3; i++) {
            kucingArray[i].info();
            kucingArray[i].bersuara();
            ikanArray[i].info();
            ikanArray[i].berenang();
            burungArray[i].info();
            burungArray[i].terbang();
        }
    }
}