package test.zad1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OsobaServiceImpl implements OsobaService {
    @Override
    public Osoba create() {
        final Scanner scanner = new Scanner(System.in);
        return new Osoba(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean(), scanner.nextShort());
    }

    @Override
    public void saveToFile(Osoba osoba, Path path) throws IOException {
        Path filePath = Paths.get(path.toString() + "\\" + "Osoba.bin");
        Files.deleteIfExists(filePath);
        final Path file = Files.createFile(filePath);
        final OutputStream outputStream = Files.newOutputStream(file);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(osoba);
        }
    }

    @Override
    public Osoba objFromFile(String path) throws IOException, ClassNotFoundException {
        final FileInputStream fileInputStream = new FileInputStream(path);
        final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Osoba) objectInputStream.readObject();
    }

}
