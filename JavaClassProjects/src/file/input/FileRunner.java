package file.input;

import java.io.IOException;

/**
 * Created by Tunde on 09/01/2017.
 */
public class FileRunner {

    public static void main(String[] args) throws IOException {

        /*ElectricityBills bills = new ElectricityBills();

        String[] text = {"John", "Kelly", "Robert", "Mugabe", "Donald", "Trump"};

        bills.createFile();
        bills.writeIntoFile();
        bills.writeMoreIntoFile();
        bills.writeFileInArray(text);
        bills.readFile();*/

        //String[] text = {"John", "Kelly", "Robert", "Mugabe", "Donald", "Trump"};

        CreateFileDemo createFile = new CreateFileDemo();
        createFile.createMyFile();
        createFile.writeIntoFile();
        //createFile.writingArraysOnNumber();
        createFile.ReadFile();
    }
}
