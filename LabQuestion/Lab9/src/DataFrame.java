
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DataFrame {

    private String file;                        // file name or path
    private int lineCount;                      // get the line number to declare size of the fileContent array
    private String[] fileContent, labels;       // fileContent to store each line of the file, labels to store column headers
    protected String[][] fileData;              // store each value in the data frame

    public void read(String file) {
        this.file = file;
        fileData();
    }

    // read and store each line of the file into an array
    private void fileContent() {
        fileLineCount();    // get the line number of the file
        // to store the content into array
        //System.out.println(line);
        fileContent = new String [lineCount];    // declare an array with size equals to the line number
        try {    // try to read from the file
            Scanner input = new Scanner(new FileInputStream(file));
            for (int i=0 ; i<lineCount ; i++) {
                fileContent[i] = input.nextLine();    // store each line into the String array
                //System.out.println(content[i]);
            }
            input.close();
        } catch (FileNotFoundException e) {    // catch file not found exception
            System.out.println("File was not found.");
        }
    }

    // get number of line of the file
    private void fileLineCount() {
        lineCount = 0 ;    // initialize line count as 0
        try {    // try to read from the file
            Scanner input = new Scanner (new FileInputStream(file));
            while (input.hasNextLine()) {
                input.nextLine();
                lineCount++;    // increase line count by 1 when there is a line
            }
            input.close();
            //System.out.println(lineCount);
        } catch (FileNotFoundException e) {    // catch file not found exception
            System.out.println("File was not found.");
        }
    }

    // get header elements
    private void getColumnLabel() {
        labels = fileContent[0].split(",");    // split the String by ',' and store each String into nrew array
    }

    // get number of column in a line
    private int ColumnCount() {
        int column = labels.length;
        return column;
    }

    // get data of the file
    protected void fileData() {
        // call line, line content
        fileContent();   // make fileContent(file) array as reference
        fileLineCount();   // get the number of row
        fileData = new String[lineCount][];    // declare a 2D array to store file data
        for (int i=0 ; i<fileData.length ; i++) {
            fileData[i] = fileContent[i].split(",");    // assign the elements of each line into 
            // each row of the array
        }
    }



    // print CSV into DataFrame 
    public void display() {
        for (int i=0 ; i<fileData.length ; i++) {
            System.out.printf("%16s ",fileData[i][0]);
            for (int j=1 ; j<fileData[i].length ; j++) {
                System.out.printf("%16s ", fileData[i][j]);
            }
            System.out.println();
        }
    }

    // display column labels
    public void displayColumnLabel() {
        getColumnLabel();
        System.out.println("Column Labels: " + Arrays.toString(labels));
    }


    // method to save the data frame into csv file
    public void save(String file) {
        try {
            System.out.println("Saving file.");
            PrintWriter s = new PrintWriter(new FileOutputStream(file));
            for (int i=0 ; i<fileData.length ; i++) {
                s.println(toCSV(i));
            }
            s.close();
            System.out.println("File saved.");
        } catch (IOException e) {
            System.out.println("Problem with file output.\n"
                    + "File was not saved.");
        }
    }

    // method to convert row of values into csv format
    private String toCSV(int count) {
        String str = fileData[count][0];
        for (int i=1; i<fileData[0].length ; i++) {
            str = str+","+fileData[count][i];
        }
        return str;
    }
}