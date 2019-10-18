package test.zad5;

public class Wiadomosc {
    private int dzien;
    private int miesiac;
    private int rok;
    private String godzina;
    private String user;
    private String ip;
    private String tekst;

    @Override
    public String toString() {
        return "Wiadomosc{" +
                "dzien=" + dzien +
                ", miesiac=" + miesiac +
                ", rok=" + rok +
                ", godzina='" + godzina + '\'' +
                ", user='" + user + '\'' +
                ", ip='" + ip + '\'' +
                ", tekst='" + tekst + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public Wiadomosc() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getDzien() {
        return dzien;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getGodzina() {
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public Wiadomosc(int dzien, int miesiac, int rok, String godzina, String user, String ip, String tekst) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
        this.godzina = godzina;
        this.user = user;
        this.ip = ip;
        this.tekst = tekst;
    }
}
