import klase.Kamion;
import klase.Vozilo;
import klase.Vozac;

public class Main {

    public static void main(String[] args) {
        Vozac Vukasin= new Vozac("Vukasin Zugic","5255252255","B");
        Vozac Jovan = new Vozac("Jovan Savic","9849849846","C");
        Vozilo audi = new Vozilo("auto",true,8,Vukasin);
        Kamion ww = new Kamion("ww",false,16,Jovan);

        System.out.println(Vukasin.toString());
        System.out.println(audi.toString());
    }
}