package mobils;

abstract class Mobil {
    public abstract void nyalakanMesin();
    public abstract void matikanMesin();
}

class MobilSport extends Mobil {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil sport dinyalakan dengan suara menggelegar!");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mobil sport dimatikan dengan halus.");
    }
}

class MobilSedan extends Mobil {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mobil sedan dinyalakan secara halus.");
    }

    @Override
    public void matikanMesin() {
        System.out.println("Mobil sedan dimatikan dengan aman.");
    }
}

public class Mobils {
    public static void main(String[] args) {
        MobilSport mobilSport = new MobilSport();
        MobilSedan mobilSedan = new MobilSedan();

        mobilSport.nyalakanMesin();
        mobilSport.matikanMesin();

        mobilSedan.nyalakanMesin();
        mobilSedan.matikanMesin();
    }
}