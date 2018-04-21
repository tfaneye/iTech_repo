package file.input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileDemo {

    private File file;
    private FileWriter fileWriter;

    /*public CreateFileDemo(String fileName) {


        //file = new File(fileName);
    }*/


    //this method creates a new file if has not been created
    public void createMyFile(){

       // String fileName = "/home/inet-tech/ProjectRepos/lion_repo/JavaClassProjects/test_data/file.txt";
        String rootPath = System.getProperty("user.dir");
        String filePath =  rootPath.concat("/test_data/file.txt");
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
            fileWriter.write("\n\nThis is good \nThis is good \nThis is good");                        //("Java Web Automation \nBatch 2018");    //("This is our first writing into file \n we are getting better");
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
                String tx = text.replaceFirst("", ", ");
                fileWriter.write(tx + "\n");
            }

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
