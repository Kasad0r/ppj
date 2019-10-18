package test.zad1;

import java.io.IOException;
import java.nio.file.Path;

public interface OsobaService {
    Osoba create();

    void saveToFile(Osoba osoba, Path path) throws IOException;

    Osoba objFromFile(String path) throws IOException, ClassNotFoundException;
}
