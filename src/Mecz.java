public class Mecz  {
    protected int wynik;
    private Druzyna druzynaA;
    private Druzyna druzynaB;

 // NIE WIEM CZY TO DZIALA NAWET

    public Mecz( int wynik, Druzyna druzynaA, Druzyna druzynaB) {
        this.wynik = wynik;
        this.druzynaA = druzynaA;
        this.druzynaB = druzynaB;
    }
    public Mecz() {

    }

    public int getWynik() {
        return wynik;
    }

    public Druzyna getDruzynaA() {
        return druzynaA;
    }

    public Druzyna getDruzynaB() {
        return druzynaB;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return String.format("Wynik to: %d",wynik);
    }
}
