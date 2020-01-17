package cw24;

import java.util.HashMap;
import java.util.Map;

public class Cw24 {

    private static Map<Double, Character> czestosc = new HashMap<>();

    public static void main(String[] args) {
        czestosc.put(8.91, 'a');
    //    czestosc.put(0.99, 'ą');
        czestosc.put(1.47, 'b');
        czestosc.put(3.96, 'c');
      //  czestosc.put(0.4, 'ć');
        czestosc.put(3.25, 'd');
        czestosc.put(7.66, 'e');
        //czestosc.put(1.11, 'ę');
        czestosc.put(0.3, 'f');
        czestosc.put(1.42, 'g');
        czestosc.put(1.08, 'h');
        czestosc.put(8.21, 'i');
        czestosc.put(2.28, 'j');
        czestosc.put(3.51, 'k');
        czestosc.put(2.10, 'l');
        //czestosc.put(1.82, 'ł');
        czestosc.put(2.80, 'm');
        czestosc.put(5.52, 'n');
        //czestosc.put(0.2, 'ń');
        czestosc.put(7.75, 'o');
        //czestosc.put(0.85, 'ó');
        czestosc.put(3.13, 'p');
        czestosc.put(0.14, 'q');
        czestosc.put(4.69, 'r');
        czestosc.put(4.32, 's');
        //czestosc.put(0.66, 'ś');
        czestosc.put(3.98, 't');
        czestosc.put(2.5, 'u');
        czestosc.put(0.04, 'v');
        czestosc.put(4.65, 'w');
        czestosc.put(0.02, 'x');
        czestosc.put(3.76, 'y');
        czestosc.put(5.64, 'z');
        //czestosc.put(0.06, 'ź');
        //czestosc.put(0.83, 'ż');
        statFromTxt("LmpóksdetlęTotmtkihlbtwtcąvąihetikrptmgxvatktvmxkGtfx,lbwx(Zhhw,Xobe), vtitvbmr, atgw(iksxvahpncx hubxdm detlr Lmnﬀ), Utzitvd mtuebvt iksxvahpncąvt hubxdmr detlr Lmnﬀ. Itfbęmtc h nmphksxgbn dhglmkndmhkt, zxmmxkóp b lxmxkóp. Fnlbls kópgbxż whwtć fxmhwr ihsptetcąvx gt stksąwstgbx xdpbingdbxf npszeęwgbtcąv sfbxggą vtitvbmr npszeęwgbtcąvą ftdlrftegr nwźpbz ihlmtvb (ksxvsr mksrftgx p włhgbtva ctd b p iexvtdn, itfbęmtc mxż, żx ihlmtć fhżx gbx ihlbtwtć żtwgrva iksxwfbhmóp). ");
    }

    public static Map<Double, Character> statFromTxt(String s) {
        Map<Character, Integer> stat = new HashMap<>();
        for (char c : s.toCharArray()) {
            stat.merge(c, 1, Integer::sum);
        }
        System.out.println(stat);
        return null;
    }

}
