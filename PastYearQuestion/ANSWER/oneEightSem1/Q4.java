package oneEightSem1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

class Q4{
    public static void main(String[] args) {
        try{

            Scanner inputStream = new Scanner (new FileInputStream("Q4.txt"));
            String name;
            double [] score = new double [5];
            double difficulty ;
            String winner="" ;
            double highScore=0 ;
            //assume the textFile is in the format name,score,diffulty
            while(inputStream.hasNextLine()){
                String [] line = inputStream.nextLine().split(",");
                name = line[0];
                //5 judges
                for(int j = 0 ; j < 5 ; j ++){
                    score[j] = Double.parseDouble(line[j+1]);
                }
                Arrays.sort(score);
                difficulty = Double.parseDouble(line[line.length-1]);

                double finalScore = 0 ;
                for(int j = 1 ; j < score.length - 1; j ++){
                    finalScore += score[j]*difficulty;
                }

                if(finalScore > highScore){
                    highScore = finalScore;
                    winner = name;
                }

                System.out.println(name + " score "  + finalScore );
            }

            System.out.println(winner + " is the winner");
            inputStream.close();
        }catch (Exception e){
            System.out.println("ERROR");
        }
    }
}
