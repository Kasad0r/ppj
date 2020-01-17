package cw21;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@Getter
@Setter
public class Punkt3D extends Punkt2D {
    private int z;

    public void odleglosc(Punkt3D p) {
        System.out.println(sqrt(pow(getX() - p.getX(), 2) + pow(getX() - p.getY(), 2) + pow(z - p.getZ(), 2)));
    }
}
