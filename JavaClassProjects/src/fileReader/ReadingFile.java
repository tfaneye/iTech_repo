package fileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Tunde on 13/03/2018.
 */
public class ReadingFile {

    private static FileInputStream fis;
    private static Properties prop;


    public static void main(String[] args) throws IOException {
        fis = new FileInputStream(System.getProperty("user.dir") + "/src/resources/env.properties");
        prop = new Properties();
        prop.load(fis);
        System.out.println(prop);
    }
}
