import java.util.ArrayList;

public class Druzyna extends Mecz{
    private String nazwa;


    public Druzyna(String nazwa,int wynik) {
        super();
        this.nazwa = nazwa;
        wynik = getWynik();
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return String.format("Nazwa Drużyny to: %s,%d",nazwa,getWynik());
    }
}
