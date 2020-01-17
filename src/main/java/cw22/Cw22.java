package cw22;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Cw22 {
    public static void main(String[] args) {

    }


    private static void foo() throws IOException {
        String keywords =
                "abstract continue for new switch " +
                        "assert default goto package synchronized" +
                        "boolean do if private this" +
                        "break double implements protected throw" +
                        "byte else import public throws " +
                        "case enum instanceof return transient " +
                        "catch extends int short try " +
                        "char final interface static void " +
                        "class finally long strictfp volatile " +
                        "const float native super while";
        String[] keywordsArr = keywords.split(" ");
        int[] keywordsPopulation = new int[keywords.length() - 1];

        Scanner scanner = new Scanner(Paths.get("Z:\\java\\pjj\\src\\main\\java\\cw20\\Monster.java"));
        while (scanner.hasNext()) {
            String replace = scanner.nextLine().replace("(", " ").replace("{", " ");
            String[] s = replace.split(" ");
            for (String s1 : s) {

            }
        }
    }
}
