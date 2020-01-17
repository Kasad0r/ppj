package cw19.phone;

import cw19.Person;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Smartfon extends Komorka {

    private List<Person> znajomi;

    public Smartfon(String interfejsKomunikacyjny, String color, List<Person> znajomi) {
        super(interfejsKomunikacyjny, color);
        this.znajomi = znajomi;
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        super.wyswietlHistoriePolaczen();
    }
}
