package cw19.phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Komorka extends Telefon {
    private List<String> lastcalls;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
        this.lastcalls = new ArrayList<>(10);
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
        lastcalls.add(numer);
        new Random().nextDouble();
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        super.wyswietlHistoriePolaczen();
    }
}
