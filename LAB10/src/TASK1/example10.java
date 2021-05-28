package TASK1;

import java.io.*;

public class example10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try { // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("MyFile1.txt"),"cp1251"));
            out = new PrintWriter("MyFile2.txt", "cp1251");
            int lineCount = 0; String s;
            while ((s = br.readLine()) != null) { lineCount++; out.println(lineCount + ": " + s);
            }
        } catch (IOException e) { System.out.println("Ошибка !!!!!!!!"); }
        finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();
        }}
}
