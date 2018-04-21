package file.input;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriter {
    private static String[] columns = {"Name"};
    private static List<CreateXcelFile> xcelFiles = new ArrayList<>();
    static {xcelFiles.add(new CreateXcelFile("James"));}

    public static void main(String[] args) {
        //XSSFWorkbook xcelBook = new XSSFWorkbook();
    }
}
