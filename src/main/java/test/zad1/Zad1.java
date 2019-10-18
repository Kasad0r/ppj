package test.zad1;

import java.util.ArrayList;
import java.util.List;

public class Zad1 {
    public static void main(String[] args) {
        final List<Osoba> osobaList = new ArrayList<>();
        final OsobaService osobaService = new OsobaServiceImpl();
        osobaList.add(osobaService.create());
        osobaList.add(osobaService.create());
        osobaList.add(osobaService.create());
        osobaList.add(osobaService.create());
    }
}
