package cw21;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.*;

@Getter
@Setter
public class Punkt2D {
    private int x;
    private int y;

    public void odleglosc(Punkt2D p) {
        System.out.println(sqrt(pow(x - p.getX(), 2) + pow(y - p.getY(), 2)));
    }
}
