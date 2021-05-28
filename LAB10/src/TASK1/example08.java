package TASK1;

import java.io.*;
import java.net.URL;

public class example08 {

    public static void readALLByByte(Reader in ) throws IOException{
        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.print((char)oneByte);
            }else{
                System.out.print("\n" + "THE END");
                break;
            }
        }
    }

    public static void main(String argv[]){
        try {
            InputStream inFile = new FileInputStream("File061.txt");
            Reader rFile = new InputStreamReader(inFile,"cp1251");
            readALLByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream(); // байтовый
            Reader rUrl=new InputStreamReader(inUrl, "cp1251"); // символьный
            readALLByByte(rUrl); System.out.print("\n\n\n"); inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11}); Reader rArray=new InputStreamReader(inArray,"cp1251" ); // символьный
            readALLByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
