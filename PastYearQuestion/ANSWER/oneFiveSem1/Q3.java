import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        try{
            Scanner inputStream = new Scanner(new FileInputStream("Q3.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("summary.txt"));
            int d = 0;
            int e = 0;
            int f = 0;

            //assume the text format is type,number
            while(inputStream.hasNextLine()){
                String[] line = inputStream.nextLine().split(",");
                if(line[0].equalsIgnoreCase("Product D")){
                    d = Integer.parseInt(line[1]);
                }
                if(line[0].equalsIgnoreCase("Product E")){
                    e = Integer.parseInt(line[1]);
                }
                if(line[0].equalsIgnoreCase("Product F")){
                    f = Integer.parseInt(line[1]);
                }
            }
            outputStream.println("Total number of orders [Product D] : " + d);
            outputStream.println("Total number of orders [Product E] : " + e);
            outputStream.println("Total number of orders [Product F] : " + f);

            if(d > e && d > f){
                outputStream.println("Product D has the highest number of order.");
            }if(e > f){
                outputStream.println("Product E has the highest number of order.");
            }else {
                outputStream.println("Product F has the highest number of order.");
            }
            inputStream.close();
            outputStream.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }
}
