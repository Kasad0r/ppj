package cw28;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Cw28 {
    public static void main(String[] args) {
        zad5();
        System.out.println("----------------------------------------");
        System.out.println();
        zad4();
        System.out.println("----------------------------------------");
        System.out.println();
        zad3();
        System.out.println("----------------------------------------");
        System.out.println();
        zad2();
        System.out.println("----------------------------------------");
        System.out.println();
        zad1();
    }

    private final static Pattern ipPattern = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");

    public static void zad1() {
        String s = "ATGTGAACTCCCTAG";
        String t = "ACCTAGGACCCCCCC";
        Pattern pattern = Pattern.compile("[AGCT]*");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(t);
        System.out.println(matcher.matches());

    }

    public static void zad4() {
        List<String> zad3Lista = zad3();
        for (String s : zad3Lista) {
            System.out.print(s + "\t" + (checkIsHexIp(s) != null +"\t    "));
        }
    }

    @SneakyThrows
    public static void zad5() {
        Pattern pattern = Pattern.compile("((\\+)(\\d){1,9}(\\((\\d{0,3}|(\\.))(\\)))\\d{0,9})|(\\d{1,4}((\\s|\\-|_)(\\d{1,4}))*)$");
        Scanner scanner = new Scanner(Paths.get("Z:\\java\\pjj\\src\\main\\resources\\telFormat.txt"));
        while (scanner.hasNext()) {
            Matcher matcher = pattern.matcher(scanner.nextLine());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }

    }

    public static String checkIsHexIp(String hexIp) {
        Pattern pattern = Pattern.compile("(?:[0-9]|[a-z]{0,2}\\:){5}([0-9]|[a-z]){0,2}");
        Matcher matcher = pattern.matcher(hexIp);
        return matcher.find() ? matcher.group() : null;
    }

    public static void zad2() {
        String sb = "ATGTGAACTCCCTAG";
        Pattern pattern = Pattern.compile("^(ATG)([AGCT]+)(TAG|TAA|TGA)$");
        Matcher matcher = pattern.matcher(sb);
        System.out.println(matcher.find() ? "Zawiera" : "Nie zawira");
        if (matcher.matches()) {
            System.out.println(matcher.group(2) + "    DDD");
        }
    }

    @SneakyThrows
    public static List<String> zad3() {
        List<String> ip = getIp(getLogData("Z:\\java\\pjj\\src\\main\\resources\\serverLog.txt"));
        List<String> hexIp = new ArrayList<>();
        System.out.println(ip);
        for (String s : ip) {
            String[] split = s.split("\\.");
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                String s1 = split[i];
                res.append(Integer.toHexString(Integer.valueOf(s1)));
                if (i < split.length - 1) {
                    res.append(":");
                }
            }
            hexIp.add(res.toString());
            res = new StringBuilder();
        }
        System.out.println(hexIp);
        return hexIp;
    }

    private static String parseIp(String line) {
        final Matcher matcher = ipPattern.matcher(line);
        return matcher.find() ? matcher.group() : null;
    }

    public static String getLogData(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path)).useDelimiter("\\Z");
        final StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine()).append("\n");
        }
        return sb.toString();

    }

    public static List<String> getIp(String data) {
        return Arrays.stream(data.split("\n")).map(Cw28::parseIp).collect(Collectors.toList());
    }
}
