package cw21;

public class Ciastko {
    private String nazwa;
    private double masa;
    private String kod;

    public Ciastko() {
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public double getMasa() {
        return this.masa;
    }

    public String getKod() {
        return this.kod;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Ciastko;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $nazwa = this.getNazwa();
        result = result * PRIME + ($nazwa == null ? 43 : $nazwa.hashCode());
        final long $masa = Double.doubleToLongBits(this.getMasa());
        result = result * PRIME + (int) ($masa >>> 32 ^ $masa);
        final Object $kod = this.getKod();
        result = result * PRIME + ($kod == null ? 43 : $kod.hashCode());
        return result;
    }

    public String toString() {
        return "Ciastko(nazwa=" + this.getNazwa() + ", masa=" + this.getMasa() + ", kod=" + this.getKod() + ")";
    }
}
