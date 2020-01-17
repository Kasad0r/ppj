package test.zad3;

import test.zad1.OsobaService;
import test.zad1.OsobaServiceImpl;

import java.io.IOException;

public class Zad3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        OsobaService osobaService = new OsobaServiceImpl();
        System.out.println(osobaService.objFromFile("Z:\\java\\pjj\\src\\main\\resources\\Person.bin"));
    }
}



