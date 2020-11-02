package finalfop;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        //用来收全部numbers , example : 2,4,6,8,10
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        //用来收frequency for全部numbers , example : 9,9,13,10,9 >> 9是frequency of 2， 9 是frequency of 4， 13是 frequency of 6......
        ArrayList<Integer> frequency = new ArrayList<Integer>();
        
        //从那个file那边抽出来全部numbers ， 同一时间也一起算那个frequency
        getNumber(numbers,frequency);
        
        //print out frequency for全部号码
        printOutFrequency(numbers,frequency);
        
        //print out mode
        printOutMode(numbers,frequency);
    }

    //从file抽出全部values
    public static void getNumber(ArrayList<Integer> numbers, ArrayList<Integer> frequency) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("raw.txt"));
            while (inputStream.hasNextInt()) {
                int num = inputStream.nextInt();
                //如果那个numbers list里面没有这个number， 代表说这是一个新的号码
                if (!numbers.contains(num)) {
                    //所以我就把它加进去number list 里面
                    numbers.add(num);
                    //然后在frequency 里面加一个0 for这个number
                    //用0的原因是因为，不管它是不是一个新的号码，我在下一行都会加1去那个frequency
                    frequency.add(0);
                }
                
                //找出这个号码在number list 和frequency list 的index
                //号码在number list 和 frequency list 的index 是一样的
                //比如说number list : 1,2,3  frequency list :5,6,7 
                //2在number list 的index是1，then它在frequency list的index也是1，就是说6是frequency of 2
                int indexOfNum = numbers.indexOf(num);
                
                //把frequency of那个number加一
                frequency.set(indexOfNum, frequency.get(indexOfNum) + 1);
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
    
    //拿最大的frequency
    public static int getMaxFrequency(ArrayList <Integer> frequency){
        int maxFreq = 0 ;
        //check 全部frequency store，从那边找出max value
        for(int i = 0 ; i < frequency.size() ; i++){
            if(frequency.get(i) > maxFreq){
                maxFreq = frequency.get(i);
            }
        }
        return maxFreq;
    }
    
    //把mode print 出来
    public static void printOutMode(ArrayList <Integer> numbers , ArrayList <Integer> frequency ){
        int maxFreq = getMaxFrequency(frequency);
        System.out.print("The mode of the dataset is : ");
        
        //看那个号码的frequency和max frequency一样，then那个号码就是mode了，就把它print出来
        for(int i = 0 ; i < numbers.size(); i++){
            if(frequency.get(i) == maxFreq){
                System.out.print(numbers.get(i) + " ");
            }
        }
        
        //just for 美感，把build successful 移下去
        System.out.println("");
    }
    
    //把frequency for每一个号码print出来
    public static void printOutFrequency (ArrayList <Integer> numbers , ArrayList <Integer> frequency ){
        for(int i = 0 ; i < numbers.size() ; i++){
            //就像我刚刚说到的，for每一个号码，它在numbers 的index和在frequency的index是一样的
            System.out.println(numbers.get(i) + " : " + frequency.get(i));
        }
        System.out.println("Frequency Distribution Table");
    }
}
