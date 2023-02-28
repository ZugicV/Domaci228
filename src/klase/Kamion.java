package klase;

public class Kamion extends Vozilo {

    public Kamion() {
    }

    public Kamion(String tipVozila, boolean registrovano, int portrosnja, Vozac vlasnik) {
        super(tipVozila, registrovano, portrosnja, vlasnik);
    }

    public int potrosnjaGoriva(int portrosnja, int kilometraza){
        return (portrosnja/100)*kilometraza;
    }
}
