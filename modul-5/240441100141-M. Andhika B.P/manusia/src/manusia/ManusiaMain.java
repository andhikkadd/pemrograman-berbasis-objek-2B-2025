package manusia;

abstract class Manusia {
    public abstract void berbicara();
    public abstract void bekerja();
    public abstract void makan();
}

class Joko extends Manusia {
    @Override
    public void berbicara() {
        System.out.println("Joko berbicara dengan santai.");
    }

    @Override
    public void bekerja() {
        System.out.println("Joko bekerja dengan penuh serius.");
    }

    @Override
    public void makan() {
        System.out.println("Joko sangat menikmati makanan yg dibelinya!");
    }
}

class Beni extends Manusia {
    @Override
    public void berbicara() {
        System.out.println("Beni berbicara dengan tegas dan luwes.");
    }

    @Override
    public void bekerja() {
        System.out.println("Beni bekerja dengan disiplin.");
    }

    @Override
    public void makan() {
        System.out.println("Beni lebih suka makanan pedas dan gurih.");
    }
}

class Fani extends Manusia {
    @Override
    public void berbicara() {
        System.out.println("Fani berbicara dengan ramah.");
    }

    @Override
    public void bekerja() {
        System.out.println("Fani bekerja dengan sangat teliti.");
    }

    @Override
    public void makan() {
        System.out.println("Fani sangat menyukai makanan manis.");
    }
}

class Jani extends Manusia {
    @Override
    public void berbicara() {
        System.out.println("Jani berbicara dengan cepat dan lantang.");
    }

    @Override
    public void bekerja() {
        System.out.println("Jani bekerja dengan penuh energi.");
    }

    @Override
    public void makan() {
        System.out.println("Jani suka mencoba makanan baru yang unik.");
    }
}

public class ManusiaMain {
    public static void main(String[] args) {
        Joko joko = new Joko();
        Beni beni = new Beni();
        Fani fani = new Fani();
        Jani jani = new Jani();

        joko.berbicara();
        joko.bekerja();
        joko.makan();
        System.out.println("");

        beni.berbicara();
        beni.bekerja();
        beni.makan();
        System.out.println("");

        fani.berbicara();
        fani.bekerja();
        fani.makan();
        System.out.println("");

        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}