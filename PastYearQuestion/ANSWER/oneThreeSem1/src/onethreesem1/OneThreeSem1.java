package onethreesem1;
//1st error
import java.io.FileInputStream;
import java.util.Scanner;
public class OneThreeSem1 {
    public static void main(String[] args) {
        //2nd error System.in
        Scanner s = new Scanner(System.in);
        char letter;
        String temp;
        //3rd error = 0
        int count = 0;
        do{
            System.out.print("Enter a letter (Q to quit): ");
            //4rd error next().charAt(0)
            letter = s.next().charAt(0);
            //5th error == 
            if(letter == 'Q')
                break;
            else
                //6th error count++
                count++;
        }while(letter != 'Q'); //7th error missing ;
        //8th error &d
        System.out.printf("The total of number of character you enter is : %d", count);
    }
}

class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] name = new String [5];
        for(int i = 0 ; i < 5 ; i ++){
            System.out.print("Enter student name:");
            name[i] = input.nextLine();
        }
        System.out.println("The student name in alphabetical order are: ");
        for(int i = 0 ; i < 4 ; i ++){
            for(int j = 0 ; j < 4 ; j ++){
                if(name[j+1].compareToIgnoreCase(name[j]) < 0){
                    String temp = name[j+1];
                    name[j+1] = name[j];
                    name[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(name[i]);
        }
    }
}

class Q3{
    public static void main(String[] args) {
        //assume text file in format Code,Amount in each line
        try{
            Scanner inputStream = new Scanner(new FileInputStream("Q3.txt"));
            while(inputStream.hasNextLine()){
                String [] line = inputStream.nextLine().split(",");
                String code = line[0];
                double amount = Double.parseDouble(line[1]);
                double amountRM = 0;
                if(code.equalsIgnoreCase("AUD")){
                    amountRM = amount*3.25;
                }
                if(code.equalsIgnoreCase("SG")){
                    amountRM = amount*2.53;
                }
                if(code.equalsIgnoreCase("EU")){
                    amountRM = amount*4.03;
                }
                if(code.equalsIgnoreCase("USD")){
                    amountRM = amount*3.11;
                }
                System.out.printf(code + " %.2f" + " = RM %.2f" ,amount,amountRM);
                System.out.println("");
            }
            inputStream.close();
        }catch (Exception e){
            System.out.println("ERROR");   
        }
    }
}

class Staff{
    protected String name ;
    protected String ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    
    public String toString(){
        return "Full Name: " + name +
                "\nIC: " + ic + "\n";
    }
}

class PermanentStaff extends Staff{
    private String grade;
    
    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public int getSalary(){
        if(grade.equalsIgnoreCase("A01")){
            return 5000;
        }else if(grade.equalsIgnoreCase("A02")){
            return 4000;
        }else if(grade.equalsIgnoreCase("A03")){
            return 3000;
        }else if(grade.equalsIgnoreCase("A04")){
            return 2000;
        }else{
            return 0;
        }
    }
    
    public String toString(){
        return super.toString() + "Grade: " + grade +
                "\nSalary: RM " + getSalary() + "\n";
    }

}

class PartTimeStaff extends Staff{
    private int workingHour;

    public PartTimeStaff(String name, String ic, int workingHour) {
        super(name, ic);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    
    public int getSalary(){
        return 50*workingHour;
    }
    
    public String toString(){
        return super.toString() + "Number of working hours: " + workingHour
                + "\nSalary: RM " + getSalary() + "\n";
    }
    
}

class Q4{
    public static void main(String[] args) {
        PermanentStaff p1 = new PermanentStaff("Ahmad Taheri", "801001-14-1765", "A03");
        System.out.println(p1.toString());
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "811223-08-3301",23);
        System.out.println(p2.toString());
    }
}