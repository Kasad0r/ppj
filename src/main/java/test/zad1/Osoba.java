package test.zad1;

import java.io.Serializable;

public class Osoba implements Serializable {
    private final long serialVersionUID = 42L;
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private boolean plec;
    private short kodPocztowy;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia, boolean plec, short kodPocztowy) {
        if (imie == null || imie.isEmpty() || nazwisko == null || nazwisko.isEmpty() || rokUrodzenia < 1900) {
            throw new NiewlasciweDaneException();
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.plec = plec;
        this.kodPocztowy = kodPocztowy;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", plec=" + plec +
                ", kodPocztowy=" + kodPocztowy +
                '}';
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    public void setPlec(boolean plec) {
        this.plec = plec;
    }

    public short getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(short kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
}
