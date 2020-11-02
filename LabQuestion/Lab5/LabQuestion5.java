package LabQuestion.Lab5;
import java.util.*;
public class LabQuestion5 {
    public static void main (String[]Args){
    Scanner input= new Scanner (System.in);
    Random rnd= new Random();
    //Question1
    System.out.println("Please enter the number of students");
    int N = input.nextInt();
    int [] score = new int [N];
    int sum =0;
    for (int i=0; i<N; i++){
        score [i] = rnd.nextInt(100) + 1;
        sum += score[i];
        System.out.println("The score is " + score[i]);
    }
    int average = sum / N;
    Arrays.sort(score);
        System.out.println("The lowest score is " + score[0]);
        System.out.println("The highest score is " + score [N-1]);
        System.out.println("The average score is " + average);
      
    //Question2
    int [] num = new int [10];
    for (int i=0;i<10;i++){
        num [i]=rnd.nextInt(21);
        for (int n=0;n<i;n++){ 
            if(num[n]==num[i]){
                i--;
                break;
            }
        }
    }
    System.out.print("The 10 numbers are ");
    for (int i=0;i<10;i++)
            System.out.print(num[i] + " ");
    
    //Question3
    System.out.println("\nEnter the number of workers");
    int n = input.nextInt();
    int totalHour = 0;
    for (int worker=0;worker<n;worker++){//for every one worker , it will loop once.
        int [] sevenDay = new int[7];
        for(int i = 0 ; i<7 ; i++){
            sevenDay[i]=rnd.nextInt(8)+1;
            totalHour += sevenDay[i];
        }//store the value of work hours for every seven day in a week
        System.out.print("The work hours for worker " + (worker+1) + " is");
        for(int i=0 ; i<7; i++)
            System.out.print(" " + sevenDay[i]);//print out the work hours for the worker for every day in a week
        System.out.println("\nThe total work hours for worker " + (worker+1) + " is " + totalHour);//print out the total hours
        totalHour=0;//reset the totalHour for the next worker
        
        System.out.println("");//to proceed to a new line after each worker's work hours printed
    }
    
    //Question4
    int [][] matrix= { {1,5,7},{3,6,9},{5,3,8} };
        System.out.println("3 by 3 Matrix");
    for (int i=0;i<matrix.length;i++){
        for(int z=0; z<matrix.length;z++)
            System.out.print(matrix[i][z] + " ");
        System.out.println("");
    }
    int temp=matrix[0][0];
    matrix[0][0] = matrix[2][0];
    matrix[2][0] = matrix[2][2];
    matrix[2][2] = matrix[0][2];
    matrix[0][2]= temp;
    temp = matrix[0][1];
    matrix[0][1] = matrix[1][0];
    matrix[1][0] = matrix[2][1];
    matrix[2][1] = matrix[1][2];
    matrix[1][2] = temp;
        System.out.println("After it rotates 90 degree clockwise");
    for (int i=0;i<matrix.length;i++){
        for(int z=0; z<matrix.length;z++)
            System.out.print(matrix[i][z] + " ");
        System.out.println("");
    }
    
    //Question5
    int [] integer = new int [20];
    //Displaying a set of array
    System.out.println("A list of 20 random integer within 0 to 100");
    for (int i=0; i<integer.length; i++){
        integer[i]=rnd.nextInt(101);
        System.out.print(integer[i] + " ");
    }
        System.out.println("");//space a line
        
    //sorting
    int slot;
    for (int pass=0;pass<integer.length;pass++){
        for (int i=0;i<integer.length-1;i++){
            if(integer[i]<integer[i+1]){
             slot = integer[i];
             integer[i]=integer[i+1];
             integer[i+1]=slot;
            }
        }
    }
    //Displaying a set of array after arranging it
    System.out.println("Array in descending order");
    for (int i=0; i<integer.length; i++){
        System.out.print(integer[i] + " ");
    }
        System.out.println("");//space a line
        
    //Enter the key to be searched     
    System.out.print("Enter a number to search: ");
    int keyword=input.nextInt();
        System.out.println("");//space a line
    
    //linear search
    for (int i=0; i<integer.length;i++){
        if(integer[i]== keyword){
            System.out.println(keyword +" is found");
            System.out.println("Linear search - " + i +" loops");
        }
        else if(i==integer.length-1 && integer[i] != keyword){
            System.out.println("Linear search : The number is not found");
        }
    }
        System.out.println("");
    //binary search
    int low=0, middle, high=integer.length-1 , count=0 ;
    do{
        middle=( low + high )/2;
        count+=1;
        if (keyword == integer[middle]){
            System.out.println(keyword + " is found");
            System.out.println("Binary search - " + count + " loops");
            break;
        }
        else if (integer[middle] < keyword)
            high=middle - 1;
        else 
            low = middle +1;
    } while(low <= high);
    if(low>high){
        System.out.println("Binary search : The number is not found");
    }//if the number is not inside the array
    
    //Question6
    System.out.print("Enter the number of row of Pascal Triangle to generate: ");
    int row= input.nextInt();
    int [][] SquareMatrix= new int[row][row];
    for(int i=0;i<row;i++){
    SquareMatrix[i][0]= 1;
    }//the first column is just consisted of all "1"
    for(int i=1; i<row; i++){ //start from 1 because the first row is sure to be like that
        for (int k=1; k<row; k++){//start from 1 because the first column is sure to be like that
        SquareMatrix[i][k]= SquareMatrix[i-1][k-1] + SquareMatrix[i-1][k];
        }
    }
    
    for (int i=0; i<row; i++){
        for(int k=0 ; k<row ; k++){
            System.out.printf("%4d" , SquareMatrix[i][k]);
        }
        System.out.println("");//to space a line
    }
        
    
  }
}
