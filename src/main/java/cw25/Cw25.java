package cw25;

import cw25.zd2.File;
import cw25.zd2.SecretFile;
import cw25.zd2.TopSecretFile;

import java.util.Random;

public class Cw25 {
    public static void main(String[] args) {
        getRandom().show();
    }

    public static File getRandom() {
        int i = new Random().nextInt(10);
        if (i <= 2) {
            File file = new File();
            file.setName("Arenysaurus");
            file.setPages(50);
            file.setText("Arenysaurus is a genus of hadrosaurid dinosaur from the Late Cretaceous (66 million years ago), being one of the last non-avian dinosaurs and it went extinct during the Cretaceous–Paleogene extinction event. It is known from a partial skull and skeleton found in the late Maastrichtian-age Tremp Formation of the Pyrenees Mountains in Spain. The type species is A. ardevoli, described in 2009 by Pereda-Suberbiola et al., a group of researchers from Spain. The genus name refers to Arén, where it was found, and the specific epithet honours geologist Lluís Ardèvol. The estimated body length of Arenysaurus is 5 to 6 metres (16 to 20 ft). Arenysaurus was a lambeosaurine, a member of the hadrosaurid subfamily with hollow cranial crests.[1] Arenysaurus is one of the most complete and best dated ever found in the Late Cretaceous period.[2]");
            return file;
        } else if (i > 2 && i <= 5) {
            SecretFile secretFile = new SecretFile();
            secretFile.setName("2019–20 Croatian presidential election");
            secretFile.setPages(1);
            secretFile.setText("Presidential elections were held in Croatia on 22 December 2019. As no candidate received a majority of all votes (including blank, invalid and uncast ballots), a second round took place on 5 January 2020 between the two candidates with the highest number of votes in the first round. They were the seventh presidential elections since the first direct ones were held in 1992.");
            return secretFile;
        } else {
            TopSecretFile topSecretFile = new TopSecretFile();
            topSecretFile.setName("Zoran Milanovi");
            topSecretFile.setText("Croatia, from December 2011 to January 2016. He was the also the Chairman of the Social Democratic Party of Croatia (SDP), the largest centre-left political party in Croatia, from 2007 to 2016. He consequently served as Leader of the Opposition on two separate occasions - from 2007 to 2011 and again from January to November 2016, when Davor Bernardić succeeded him as SDP chairman. On 5 January 2020, he was elected as the 5th President of Croatia by defeating the conservative incumbent, Kolinda Grabar-Kitarović");
            topSecretFile.show();
            return topSecretFile;
        }
    }
}
