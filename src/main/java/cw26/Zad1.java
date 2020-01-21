package cw26;

import test.zad4.LogService;
import test.zad4.LogServiceImpl;
import test.zad5.Wiadomosc;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {


    public static void main(String[] args) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("[A-Z]{2,10}");
        LogService logService = new LogServiceImpl();
        List<Wiadomosc> wiadomosciZLogFile = logService.getWiadomosciZLogFile("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt");
        System.out.println(wiadomosciZLogFile.get(4).getTekst());
        for (Wiadomosc wiadomosc : wiadomosciZLogFile) {
            Matcher matcher = pattern.matcher(wiadomosc.getTekst());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        String logData = logService.getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt");
        List<String> dataTime = logService.getDates(logData);
        Map<String, Integer> statistic = new HashMap<>();
        for (int i = 0; i < dataTime.size(); i++) {
            statistic.putIfAbsent(dataTime.get(i), 0);
            if (statistic.get(dataTime.get(i)) != null) {
                statistic.put(dataTime.get(i), statistic.get(dataTime.get(i)) + 1);
            }
        }
        statistic.forEach((k, v) -> System.out.println(k + " \t " + v));
        /**
         * 3
         */
        Pattern compile = Pattern.compile("\\s");
        int counter = 0;
        Matcher matcher = compile.matcher(logData);
        while (matcher.find()) {
            counter++;
        }
        System.out.println("FIND =" + counter);
        /**
         * 4
         */
        Pattern dotCompile = Pattern.compile("\\.");
        Matcher dotMatcher = dotCompile.matcher(logData);
        counter = 0;
        while (dotMatcher.find()) {
            counter++;
        }
        System.out.println("DOT " + counter);

        Pattern digitThreePattern = Pattern.compile("(?<=^...)(.*)\\d{3}");
        Matcher matcher1 = digitThreePattern.matcher(logData);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }

}
