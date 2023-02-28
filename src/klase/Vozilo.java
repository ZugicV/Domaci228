package klase;

import klase.Vozac;

public class Vozilo {
    private String tipVozila;
    private boolean registrovano;
    private int portrosnja;
    private Vozac vlasnik;

    public Vozilo() {
    }

    public Vozilo(String tipVozila, boolean registrovano, int portrosnja, Vozac vlasnik) {
        this.tipVozila = tipVozila;
        this.registrovano = registrovano;
        this.portrosnja = portrosnja;
        this.vlasnik = vlasnik;
    }

    public int potrosnjaGoriva(int portrosnja, int kilometraza){
        return (portrosnja/100)*kilometraza;

    }
    @Override
    public String toString(){
        return "Tip vozila: "+tipVozila+", registrovan: "+registrovano+", Portrosnja: "+portrosnja+ ", Vlasnik: "+vlasnik;
    }

    public String getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }

    public boolean isRegistrovano() {
        return registrovano;
    }

    public void setRegistrovano(boolean registrovano) {
        this.registrovano = registrovano;
    }

    public int getPortrosnja() {
        return portrosnja;
    }

    public void setPortrosnja(int portrosnja) {
        this.portrosnja = portrosnja;
    }

    public Vozac getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vozac vlasnik) {
        this.vlasnik = vlasnik;
    }
}
