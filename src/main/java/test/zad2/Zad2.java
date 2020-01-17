package test.zad2;

import test.zad1.Osoba;
import test.zad1.OsobaService;
import test.zad1.OsobaServiceImpl;

import java.io.IOException;
import java.nio.file.Paths;

public class Zad2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        OsobaService osobaService = new OsobaServiceImpl();
        Osoba osoba = new Osoba("Anton", "Karapuz", 2003, true, (short) 1111);
            osobaService.saveToFile(osoba, Paths.get("Z:\\java\\pjj\\src\\main\\resources"));
        System.out.println(osobaService.objFromFile("Z:\\java\\pjj\\src\\main\\resources\\test.zad1.Person.binary"));
    }
}
