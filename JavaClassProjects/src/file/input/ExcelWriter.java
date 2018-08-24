package file.input;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelWriter {

    private static File file;
    /*private static String[] columns = {"Name"};
    private static List<CreateXcelFile> xcelFiles = new ArrayList<>();
    static {xcelFiles.add(new CreateXcelFile("James"));}*/



    public static void main(String[] args) {

        String rootPath = System.getProperty("user.dir");
        String filePath =  rootPath.concat("/poiexcel/WriteSheet.xlsx");
        file = new File(filePath);

        XSSFWorkbook xcelBook = new XSSFWorkbook();

        XSSFSheet spreadsheet = xcelBook.createSheet("Emp Info");

        XSSFRow row;

        Map<String, Object[]> empinfo = new TreeMap<>();

        empinfo.put("1", new Object[] {"ID", "NAME", "DESIGNATION"});

        empinfo.put("2", new Object[] {"tp01", "John", "Tester"});

        empinfo.put("3", new Object[] {"tp02", "Maria", "Senior Tester"});

        empinfo.put("4", new Object[] {"tp03", "Barbey", "QA Engineer"});

        empinfo.put("5", new Object[] {"tp04", "Fraiser", "Test Manager"});

        Set<String> empRecords = empinfo.keySet();
        int rowid = 0;

        for(String empRecord : empRecords){
            row = spreadsheet.createRow(rowid++);
            Object[] objArr = empinfo.get(empRecord);
            int cellid = 0;

            for (Object obj : objArr){
                XSSFCell cell = row.createCell(cellid);
                cell.setCellValue((String)obj);
            }
        }

        try {
            FileOutputStream output = new FileOutputStream(file);
            xcelBook.write(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
