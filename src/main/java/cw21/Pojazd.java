package cw21;

import lombok.Data;

@Data
public class Pojazd {
    private String marka;

    public String wyswietl() {
        return "marka= " + marka;
    }
}
