package cw19;

import cw20.Avatar;

public class Sloik {
    private Dzem dzem;
    private boolean stat;


    public void otworz() {
        stat = true;
    }

    public void zamknij() {
        stat = false;
    }

    public boolean czyOtwarty() {
        return stat;
    }
}
