package cw25.zd3;

import cw25.Cw25;
import cw25.zd2.File;
import lombok.SneakyThrows;

import java.nio.file.NoSuchFileException;

public class Archives {
    private File[] archives;

    public Archives() {
        archives = new File[10];
        for (int i = 0; i < archives.length; i++) {
            archives[i] = Cw25.getRandom();
        }
    }

    public int getFilesCount() {
        int count = 0;
        for (File archive : archives) {
            if (archive != null) {
                count++;
            }
        }
        return count;
    }

    public File getFile(int number, Person person) {
        if (archives[number] == null) {
            throw new RuntimeException("Error. File not found");
        } else if (person.getName().equals("Fox Mulder")) {
            throw new XFilesException("System Failure - only matrix can help");
        } else {
            return archives[number];
        }
    }
}
