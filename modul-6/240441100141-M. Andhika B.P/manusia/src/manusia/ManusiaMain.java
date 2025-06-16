package manusia;

class Manusia {
    void berbicara() {
        System.out.println("Manusia berbicara.");
    }

    void bekerja() {
        System.out.println("Manusia bekerja.");
    }

    void makan() {
        System.out.println("Manusia makan.");
    }
}

class Joko extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Joko berbicara dengan santai");
    }

    @Override
    void bekerja() {
        System.out.println("Joko bekerja dengan penuh serius.");
    }

    @Override
    void makan() {
        System.out.println("Joko sangat menikmati makanan yg dibelinya.");
    }
}

class Beni extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Beni berbicara dengan tegas dan luwes.");
    }

    @Override
    void bekerja() {
        System.out.println("Beni bekerja dengan disiplin.");
    }

    @Override
    void makan() {
        System.out.println("Beni lebih suka makanan pedas dan gurih.");
    }
}

class Fani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Fani berbicara dengan ramah.");
    }

    @Override
    void bekerja() {
        System.out.println("Fani bekerja dengan teliti.");
    }

    @Override
    void makan() {
        System.out.println("Fani sangat menyukai makanan manis.");
    }
}

class Jani extends Manusia {
    @Override
    void berbicara() {
        System.out.println("Jani berbicara dengan cepat dan lantang.");
    }

    @Override
    void bekerja() {
        System.out.println("Jani bekerja dengan penuh energi.");
    }

    @Override
    void makan() {
        System.out.println("Jani suka mencoba makanan baru yang unik.");
    }
}

public class ManusiaMain {
    public static void main(String[] args) {
        Manusia[] orang = {new Joko(), new Beni(), new Fani(), new Jani()};

        for (Manusia manusia : orang) {
            manusia.berbicara();
            manusia.bekerja();
            manusia.makan();
            System.out.println();
        }
    }
}