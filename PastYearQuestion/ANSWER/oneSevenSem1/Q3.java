import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class Q3{
    public static void main(String[] args) {
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            String character = generateCharacter();
            System.out.println("The string generated is: " + character);
            outputStream.println(character);
            outputStream.close();
            Scanner inputStream = new Scanner(new FileInputStream("data.txt"));

            while(inputStream.hasNextLine()){
                character = inputStream.nextLine();
                char [] characterArray = new char [character.length()];
                for(int i = 0 ; i < character.length(); i++){
                    characterArray[i] = character.charAt(i);
                }
                System.out.println("String sorted in ascending order: "  + arrangeCharacter(characterArray, '>'));
                System.out.println("String sorted in descending order: " + arrangeCharacter(characterArray, '<'));
                System.out.println("OriginalString from file: " + character);
            }

            inputStream.close();
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }

    public static String generateCharacter(){
        Random rnd = new Random();
        String characters = "";
        int bigOrSmall;
        for(int i = 0 ; i < 6 ; i ++){
            bigOrSmall = rnd.nextInt(2);
            if(bigOrSmall == 0){
                characters += (char)(rnd.nextInt(26)+65);
            }else{
                characters += (char)(rnd.nextInt(26)+97);
            }
        }
        return characters;
    }

    public static String arrangeCharacter(char [] character , char direction){
        String orderedCharacter = "";
        if(direction == '<'){
            for(int i = 0 ; i < character.length ; i++){
                for(int j = 0 ; j < character.length-1 ; j++){
                    if(character[j+1] > character[j]){
                        char temp = character[j+1];
                        character[j+1] = character[j];
                        character[j] = temp;
                    }
                }
            }
        }else if(direction == '>'){
            for(int i = 0 ; i < character.length-1; i++){
                for(int j = 0 ; j < character.length-1 ; j++){
                    if(character[j+1] < character[j]){
                        char temp = character[j+1];
                        character[j+1] = character[j];
                        character[j] = temp;
                    }
                }
            }
        }else{
            return "not a valid direction";
        }
        for(int i = 0 ; i < character.length ; i++){
            orderedCharacter += character[i];
        }
        return orderedCharacter;
    }
}
