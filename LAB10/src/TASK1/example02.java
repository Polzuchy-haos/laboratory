package TASK1;

import javax.annotation.processing.RoundEnvironment;
import java.io.*;
import java.net.URL;

public class example02 {
    public static void readAllByByte(InputStream in) throws IOException{
        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.println((char) oneByte);
            }
            else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
    public static void main(String argv[]){
        try{
            InputStream inFile = new FileInputStream("C:\\Users\\userKDI\\Documents\\text.txt");
            readAllByByte(inFile);
            System.out.println("--------------------------------------");
            inFile.close();

            InputStream inUrl = new URL("https://www.google.com/").openStream();
            readAllByByte(inUrl);
            System.out.println("--------------------------------------");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{7,8,9,2,1,10});
            readAllByByte(inArray);
            System.out.println("--------------------------------------");
            inArray.close();

        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
