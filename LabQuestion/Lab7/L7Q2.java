import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L7Q2 {
    public static void main(String[] args) {
        try {
            //https://fsktm.um.edu.my/
            //domain is changed
            //URL u = new URL("http://www.fsktm.um.edu.my");
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter outputStream = new PrintWriter (new FileOutputStream("index.html"));
            while(in.hasNextLine()){
                outputStream.println(in.nextLine());
            }

            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
