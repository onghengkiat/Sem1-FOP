package TutorialQuestion;
import java.util.Scanner;
import java.util.Random;
public class Tutorial5 {

    public static void main(String[] Args) {
        Scanner input=new Scanner(System.in);
        String trying = "the computer is hanging the ok now i am tryin the method";
        //Question1
        //a
        float [] array1 = new float[12];
        
        //b
        char [] charArray = {'A','B','C','D','E'};
  
        //c
        String [] students = new String [100];
        
        //d
        int [][] array4 = new int [6] [2];
        
        //e
        int [][] array5 = {{6,9},{2,5},{4,6}};
        
        //f
        array5 [1][1]=4;
        array5 [2][0]=3;
        array5 [2][1]=7;
        
        //g 
        /*
        String [] contact = new int [size];
        for (int i=0 ; i< contact.length;i++){
            System.out.println(contact[i]);
        }
        */
        /* for (String name: contact)
            System.out.println(name);
        */
        
        //Question2
        //a
        String[]code = {"AAA","AAB","AAC","AAD"};
        
        //B
        int [] num= new int[10];
        int sum=0;
        for (int k=0;k<num.length;k++)
            sum+=num[k];
        
        //C
        int[][]t=new int [3][3];
        t[1][2]=5;
        
        //d
        int i=4;
        int [] score = new int [5];
        score[1]=78;
        score[i++]=100;
       
        //Question3
        //marks = {961,31,1,31,31}
        
        //Question4
        System.out.println("Enter a sentence");
        String sentence1=input.nextLine();
        int countOfThe=0;
        String[]sentence=sentence1.split(" ");
        for (int count=0;count<sentence.length;count++){
            if(sentence[count].equals("the"))
                countOfThe++;
        }
        System.out.println(countOfThe);
        
        //Question5
        for (int count=sentence.length-1;count>=0;count--)
            System.out.print(sentence[count] + " ");
        
        //Question6
        Random rnd= new Random();
        int integer = rnd.nextInt(256);
        System.out.println("The integer is" + integer);
        int [] bit= new int [8];            
        for(int count=0;count<8;count++){
            if(integer%2==0)
                bit[count]=0;
            else if(integer%2 != 0)
                bit[count]=1;
            integer/=2;
        }
        for(int count=7;count>=0;count--)
            System.out.print(bit[count]);
     }
}
