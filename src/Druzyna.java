import java.util.ArrayList;

public class Druzyna extends Mecz{
    private String nazwa;


    public Druzyna(String nazwa,int wynik) {
        super();
        wynik = getWynik();
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return String.format("Nazwa Drużyny to: %s,%d",nazwa,getWynik());
    }
}
