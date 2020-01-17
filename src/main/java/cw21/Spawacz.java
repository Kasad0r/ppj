package cw21;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spawacz extends Osoba {
    private int rokPoczatky;
    private double srednieWynagrodzenie;

    public Spawacz(String imie, int rokUrodzenia, int rokPoczatky, double srednieWynagrodzenie) {
        super(imie, rokUrodzenia);
        this.rokPoczatky = rokPoczatky;
        this.srednieWynagrodzenie = srednieWynagrodzenie;
    }

    @Override
    public void wuliczEmeryture() {
        System.out.println(srednieWynagrodzenie * 0.2 * 12 * (getRokPoczatky() - getRokUrodzenia()) / (15 * 12));
    }
}
