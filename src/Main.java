import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Druzyna druzyna1 = new Druzyna("DruzynaA",1);
        Druzyna druzyna2 = new Druzyna("DruzynaB",2);
        Druzyna druzyna3 = new Druzyna("DruzynaC",3);

        ArrayList<Mecz> meczs = new ArrayList<>();
        Mecz mecz1 = new Mecz(1,druzyna1,druzyna2);
        Mecz mecz2 = new Mecz(1,druzyna2,druzyna3);
        Mecz mecz3 = new Mecz(0,druzyna3,druzyna1);


        meczs.add(druzyna1);
        meczs.add(druzyna2);
        meczs.add(druzyna3);



        meczs.sort(new Comparator<Mecz>() {
            @Override
            public int compare(Mecz o1, Mecz o2) {
                return o1.getWynik() - o2.getWynik();
            }
        });

        System.out.println(meczs);


    }
}