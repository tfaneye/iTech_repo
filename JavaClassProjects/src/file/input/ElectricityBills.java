package file.input;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Tunde on 09/01/2017.
 */
public class ElectricityBills {

    private File file;

    public ElectricityBills(){
        String rootDir = System.getProperty("user.dir");

        String fileName = rootDir + "\\test_data\\myBills.txt";
        //or
        String filePath = rootDir.concat("/test_data/myBills.txt");
        file = new File(filePath);
    }

    public void createFile(){
        try {
            file.createNewFile();  //Use this method to create new file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeIntoFile(){

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("This is my first input, Hurray!!");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeMoreIntoFile(){

        String text = "This is my first text \nTo be written into file \nFrom Java codes. \nHurray! hurray!! hurray!!! \nThanks.";
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileInArray(String[] texts){

        try {
            FileWriter fileWriter = new FileWriter(file);

            for (String text : texts) {
                String newText = text +"\n";
                fileWriter.write(newText);
            }
            fileWriter.append("Ben");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() throws IOException {
        FileReader fileReader = new FileReader(file);
        char[] fileContent = new char[50];
        fileReader.read(fileContent);
        for(char content : fileContent){
            System.out.print(content);
        }
        fileReader.close();
    }
}
