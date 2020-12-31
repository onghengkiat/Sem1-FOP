import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            int TotalNumberOfRecord = inputStream.readInt();
            System.out.println("The total number of records is " + TotalNumberOfRecord);
            String [][] names = new String[TotalNumberOfRecord][3];
            try {
                int row =0 ;
                while (true) {

                    String name = inputStream.readUTF();
                    int age = inputStream.readInt();
                    char gender = inputStream.readChar();

                    names[row][0] = name;
                    names[row][1] = Integer.toString(age);
                    names[row][2] = gender + " ";
                    row ++;
                }


            } catch (EOFException e) {
                System.out.println("Finish reading file");
                for(int i = 0 ; i < names.length ; i ++){
                    for(int j = 0 ;  j < names.length  - 1;  j ++){
                        //Ali
                        //Abu
                        if (names[j][0].compareToIgnoreCase(names[j + 1][0]) > 0){
                            String [] temp = names[j];
                            names[j] = names[j+1];
                            names[j+1] = temp;
                        }
                    }
                }
                for(int i = 0 ; i < names.length ; i++){
                    System.out.println("Name is " + names[i][0]);
                    System.out.println("Age is " + names[i][1]);
                    System.out.println("Gender is " + names[i][2]);
                }
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
