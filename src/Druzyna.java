

public class Druzyna extends Mecz{
    private String nazwa;
    private int wynik = getWynik();


    public Druzyna(int wynik,String nazwa) {
        super();
        this.nazwa = nazwa;
        this.wynik = wynik;
    }

    public Druzyna(String nazwa) {
        super();
        this.nazwa = nazwa;
    }

    @Override
    public int getWynik() {
        return wynik;
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return String.format("Nazwa Drużyny to: %s,%d",nazwa,getWynik());
    }
}
//nie wiem