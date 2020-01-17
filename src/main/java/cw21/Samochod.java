package cw21;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Samochod extends Pojazd {
    private String vin;
    private int illoscDrzwi;

    @Override
    public String wyswietl() {
        return "vin " + vin + "illoscDrzwi " + illoscDrzwi + " " + super.wyswietl();

    }
}
