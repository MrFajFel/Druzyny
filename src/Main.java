import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Druzyna druzyna1 = new Druzyna(1,"druzna2");
        Druzyna druzyna2 = new Druzyna(2,"druzyna1");
        Druzyna druzyna3 = new Druzyna(3,"druzyna3");
//nie wiem
        ArrayList<Druzyna> druzynas = new ArrayList<>();

        druzynas.add(druzyna1);
        druzynas.add(druzyna2);
        druzynas.add(druzyna3);


        druzynas.sort(new Comparator<Druzyna>() {
            @Override
            public int compare(Druzyna o1, Druzyna o2) {
                return o2.getWynik() - o1.getWynik();
            }
        });

        System.out.println(druzynas);


    }
}