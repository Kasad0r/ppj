package test.zad4;

import test.zad5.Wiadomosc;

import java.io.FileNotFoundException;
import java.util.List;

public interface LogService {
    List<String> getIp(String data);

    List<String> getDates(String data);

    List<String> getWiadomosc(String data );

    String getLogData(String path) throws FileNotFoundException;

    List<Wiadomosc> getWiadomosciZLogFile(String path) throws FileNotFoundException;
}
