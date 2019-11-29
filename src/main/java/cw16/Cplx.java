package cw16;

public class Cplx {
    private int rzeczywista;
    private int urojona;

    public Cplx(int rzeczywista, int urojona) {
        this.rzeczywista = rzeczywista;
        this.urojona = urojona;
    }

    public Cplx add(Cplx cplx) {
        rzeczywista += cplx.getRzeczywista();
        urojona += cplx.getUrojona();
        return this;
    }

    public Cplx sub(Cplx cplx) {
        rzeczywista -= cplx.getRzeczywista();
        urojona -= cplx.getUrojona();
        return this;
    }

    public Cplx mul(Cplx cplx) {
        int tempRzeczywista = this.rzeczywista;
        rzeczywista = rzeczywista * cplx.getRzeczywista() - urojona * cplx.getUrojona();
        urojona = tempRzeczywista * cplx.getUrojona() + cplx.getRzeczywista() * urojona;
        return this;
    }

    public Cplx inc() {
        rzeczywista++;
        return this;
    }

    public int getRzeczywista() {
        return rzeczywista;
    }

    public void setRzeczywista(int rzeczywista) {
        this.rzeczywista = rzeczywista;
    }

    public int getUrojona() {
        return urojona;
    }

    public void setUrojona(int urojona) {
        this.urojona = urojona;
    }

    public void show() {
        System.out.println(rzeczywista + " + " + urojona + "i");
    }

}
