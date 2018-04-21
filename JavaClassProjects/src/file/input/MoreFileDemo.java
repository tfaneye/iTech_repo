package file.input;

import java.io.*;

public class MoreFileDemo {

    public static void main(String[] args) {

        String[] xs = {"1","2","3","4","5","6"};

        String fileName = "/home/inet-tech/ProjectRepos/lion_repo/JavaClassProjects/test_data/tesco2.txt";

        try {
            File file = new File(fileName);
            //FileOutputStream fos = new FileOutputStream(fileName);
            FileWriter writer = new FileWriter(file);
            for(String x : xs){
                //fos.write(x);
                writer.write(x);

            }
            writer.close();
            /*for (int x = 0; x<xs.length; x++){
                fos.write(xs[x]);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("======================================================");

        /*try{
            byte bWrite [] = {11,21,3,40,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x=0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + " ");

            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }*/

    }
}
