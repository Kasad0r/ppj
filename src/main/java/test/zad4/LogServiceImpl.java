package test.zad4;

import test.zad5.Wiadomosc;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LogServiceImpl implements LogService {
    private final static Pattern datePattern = Pattern.compile("((((([13578])|(1[0-2]))[\\-\\/\\s]?(([1-9])|([1-2][0-9])|(3[01])))|((([469])|(11))[\\-\\/\\s]?(([1-9])|([1-2][0-9])|(30)))|(2[\\-\\/\\s]?(([1-9])|([1-2][0-9]))))[\\-\\/\\s]?\\d{4})(\\s((([1-9])|(1[02]))\\:([0-5][0-9])((\\s)|(\\:([0-5][0-9])\\s))([AM|PM|am|pm]{2,2})))?");
    private final static Pattern ipPattern = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");

    @Override
    public List<String> getIp(String data) {
        return Arrays.stream(data.split("\n")).map(this::parseIp).collect(Collectors.toList());
    }

    private String parseDate(String line) {
        final Matcher matcher = datePattern.matcher(line);
        return matcher.find() ? matcher.group() : null;
    }

    private String parseIp(String line) {
        final Matcher matcher = ipPattern.matcher(line);
        return matcher.find() ? matcher.group() : null;
    }

    @Override
    public List<String> getDates(String data) {
        return Arrays.stream(data.split("\n")).map(this::parseDate).collect(Collectors.toList());
    }

    @Override
    public List<String> getWiadomosc(String data) {
        return Arrays.stream(data.split("\n")).map(LogServiceImpl::parseWiadomosc).collect(Collectors.toList());
    }

    private static String parseWiadomosc(String line) {
        return line.substring(line.lastIndexOf(">") + 1);
    }

    @Override
    public String getLogData(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path)).useDelimiter("\\Z");
        final StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        return sb.toString();

    }

    @Override
    public List<Wiadomosc> getWiadomosciZLogFile(String path) throws FileNotFoundException {
        List<Wiadomosc> wiadomoscList = new ArrayList<>();
        for (String s : getLogData(path).split("\n")) {
            Wiadomosc wiadomosc = new Wiadomosc();
            LocalDateTime localDateTime = LocalDateTime.parse(parseDate(s), DateTimeFormatter.ofPattern("M/dd/yyyy h:mm:ss a"));
            wiadomosc.setDzien(localDateTime.getDayOfMonth());
            wiadomosc.setGodzina("" + localDateTime.getHour());
            wiadomosc.setMiesiac(localDateTime.getMonthValue());
            wiadomosc.setRok(localDateTime.getYear());
            wiadomosc.setIp(parseIp(s));
            wiadomosc.setTekst(parseWiadomosc(s).trim());
            wiadomosc.setUser(s.substring(s.indexOf('-') + 1, s.indexOf('(')).trim());
            wiadomoscList.add(wiadomosc);
        }
        return wiadomoscList;
    }


}
