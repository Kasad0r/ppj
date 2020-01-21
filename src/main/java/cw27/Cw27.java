package cw27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cw27 {
    public static void main(String[] args) throws IOException {

        System.out.println("----Zadanie1----");
        String s = "ATGTGAACTCCCTAG";
        String t = "ACCTAGGACCCCCCC";

        Pattern pattern = Pattern.compile("[AGCT]*");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(t);
        System.out.println(matcher.matches());
        System.out.println();


        System.out.println("----Zadanie2----");

        String sb = "ATGTGAACTCCCTAG";
        pattern = Pattern.compile("^(ATG)([AGCT]+)(TAG|TAA|TGA)$");
        matcher = pattern.matcher(sb);
        System.out.println(matcher.find() ?"Zawiera":"Nie zawira");
        if(matcher.matches()){
            System.out.println(matcher.group(2) + "    DDD");
        }



        System.out.println();


        /* System.out.println("----Zadanie3----");
        FileReader file = new FileReader("serverLog.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int tmp = 0;
        while((tmp=file.read())!=-1){

                stringBuilder.append((char)tmp);

        }
        Pattern ip = Pattern.compile("(([01]?\\d\\d?|2[1-4]\\d|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5])\\.([01]?\\d\\d?|2[1-4]\\d?|25[1-5]))");
        Matcher m_ip = ip.matcher(stringBuilder);
        StringBuilder string = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        while(m_ip.find()){

            if(m_ip.find()){
                arr.add(m_ip.group());


            }
        }
        System.out.println(arr.toString());*/

/*

        FileReader file1 = new FileReader("telFormat.txt");
        int k =0;
        while((k=file1.read())!=-1){
            Pattern pt = Pattern.compile("");
            Matcher mt = pt.matcher(k);
        }
*/





    }
}