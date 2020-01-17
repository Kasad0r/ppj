package cw21;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Osoba {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void wuliczEmeryture(){
        System.out.println("emeryturę społeczna");
    }
}
