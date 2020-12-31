import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q6 {
    public static void main(String[] args) {
        try {
            //print out at the CLI
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");

            //scan through the file
            Scanner orderInputStream = new Scanner(new FileInputStream("order.txt"));

            //scan through the product file
            Scanner countProductStream = new Scanner(new FileInputStream("product.txt"));
            int num_product = 0 ;
            while(countProductStream.hasNextLine()){
                countProductStream.nextLine();
                num_product++;
            }
            countProductStream.close();

            Scanner productInputStream = new Scanner(new FileInputStream("product.txt"));
            String[][] product = new String[num_product][];
            for (int i = 0; i < num_product; i++) {
                //SK020
                //Enfagrow A+
                //36.79
                product[i] = productInputStream.nextLine().split(",");
            }

            //scan through the order file
            while (orderInputStream.hasNextLine()) {
                //ORD001
                //SK079
                //20
                /*
                order = {"ORD001", "SK079", "20"}
                ...
                order = {"ORD005",.....}
                */
                String[] order = orderInputStream.nextLine().split(",");
                //check if there is any order sames with the product
                for (int i = 0; i < product.length; i++) {
                    if (order[1].equalsIgnoreCase(product[i][0])) {
                        double price = Integer.parseInt(order[2])*Double.parseDouble(product[i][2]);
                        System.out.printf("%-20s%-20s%-20s%-20s%-20.2f\n",product[i][0],product[i][1],order[2],product[i][2],price);
                    }
                }
            }
            productInputStream.close();
            orderInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}

