package cw19;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Dzem {
    private String smak;
    private double waga;

    public Dzem(double waga) {
        this.waga = waga;
        smak="No name";
    }

    public Dzem(String smak) {
        this.smak = smak;
        waga=-100;

    }

}
