package file.input;

import java.io.*;
import java.util.Properties;

public class CreateFileDemo {

    private File file;
    private FileWriter fileWriter;

    private static FileInputStream fis;
    private static Properties prop;

    /*public CreateFileDemo(String fileName) {


        //file = new File(fileName);
    }*/


    //this method creates a new file if has not been created
    public void createMyFile(){

       // String fileName = "/home/inet-tech/ProjectRepos/lion_repo/JavaClassProjects/test_data/file.txt";
        String rootPath = System.getProperty("user.dir");
        String filePath =  rootPath.concat("/test_data/file.properties");
        file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //this method writes into already created file
    //method 1
    public void writeIntoFile(){

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("This is good \nThis is good \nThis is good");                        //("Java Web Automation \nBatch 2018");    //("This is our first writing into file \n we are getting better");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //writing an arrays of strings
    //Method 2
    public void writingArraysOnNumber(){
        String[] texts = {"John", "James", "Ben"};

        try {
            fileWriter = new FileWriter(file);

            for(String text : texts) {
                //String tx = text.replaceFirst("", ", ");
                fileWriter.write(text + "\n");
            }

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ReadFile(){

        /*try {
            FileReader reader = new FileReader(file);
            char[] fileContent = new char[50];
            reader.read(fileContent);

            for(char content : fileContent){
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        try {
            fis = new FileInputStream(System.getProperty("user.dir") + "/test_data/file.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(prop);
    }
}
