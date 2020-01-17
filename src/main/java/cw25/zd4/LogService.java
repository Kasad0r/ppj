package cw25.zd4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class LogService {
    public static List<String> getLogData(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public static void saveWithReverse(List<String> data, Path path) throws IOException {
        Collections.reverse(data);
        Files.deleteIfExists(path);
        Files.write(path, data);
    }

    public static void main(String[] args) throws IOException {
        List<String> logData = getLogData(Paths.get("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt"));
        saveWithReverse(logData, Paths.get("Z:\\java\\pjj\\src\\main\\resources\\goLrevres.txt"));
    }
}
