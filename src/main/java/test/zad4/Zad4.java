package test.zad4;

import test.zad5.Wiadomosc;

import java.io.FileNotFoundException;
import java.util.List;

public class Zad4 {
    public static void main(String[] args) throws FileNotFoundException {
        LogService logService = new LogServiceImpl();
      //  System.out.println(logService.getDates(logService.getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt")));
        System.out.println(logService.getWiadomosc(logService.getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt")));
        System.out.println("----------------------------------------------------");
        System.out.println(logService.getIp(logService.getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt")));
        System.out.println("----------------------------------------------------");
        System.out.println(logService.getDates(logService.getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt")));
        System.out.println("----------------------------------------------------");
        List<Wiadomosc> wiadomosciZLogFile = logService.getWiadomosciZLogFile("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt");
        wiadomosciZLogFile.forEach(System.out::println);
    }
}
