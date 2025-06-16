package mobil;

import java.util.ArrayList;
import java.util.List;

abstract class Mobil {
    abstract void nyalakanMesin();
    abstract void matikanMesin();
}

class MobilSport extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil {
    @Override
    void nyalakanMesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    void matikanMesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}

class ManajemenMobil {
    private List<Mobil> daftarMobil = new ArrayList<>();

    void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    void operasikanSemuaMobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakanMesin();
            mobil.matikanMesin();
            System.out.println();
        }
    }
}

public class MobilMain {
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();

        Mobil sport = new MobilSport();
        Mobil sedan = new MobilSedan();

        manajemen.tambahMobil(sport);
        manajemen.tambahMobil(sedan);

        manajemen.operasikanSemuaMobil();
    }
}  