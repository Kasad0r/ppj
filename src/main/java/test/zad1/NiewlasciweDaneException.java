package test.zad1;

public class NiewlasciweDaneException extends RuntimeException {
    public NiewlasciweDaneException(String txt) {
        super(txt);
    }

    public NiewlasciweDaneException() {
       super();
    }
}
