package cw19.phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Telefon implements Funkcional {
    String interfejsKomunikacyjny;
    String color;

    public void zadzwon(String numer) {
        System.out.println("Call to " + numer);
    }

    @Override
    public void wyswietlHistoriePolaczen() {

    }
}
