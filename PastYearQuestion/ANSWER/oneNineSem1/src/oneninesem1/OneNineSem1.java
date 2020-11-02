package oneninesem1;

import java.io.FileInputStream;
import java.util.Random;
import java.util.Scanner;

public class OneNineSem1 {

    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers."
                + " The random numbers must be from 0 - 100");
        int num, odd = 0, even = 0;

        //1st error Scanner to Random
        Random r = new Random();

        //2nd error i<= 10
        //3rd error , become ; 
        //4th error i-- become i++
        for (int i = 1; i <= 10; i++) {
            //5th error nextInt(101)
            num = r.nextInt(101);
            System.out.print(num + " ");

            //6th error !isEven(num)
            if (!isEven(num)) {
                ++even;
            } else {
                ++odd;
            }
        }

        System.out.println("\nNumber of odd number: " + odd);

        //7th error , becomes +
        System.out.println("Number of even number: " + even);
    }

    //8th error static method
    //9th error int a
    public static boolean isEven(int a) {
        //10th error a%2 == 0 is even
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = input.nextInt();
        int[][] matrixA = generateMatrix(n);
        int[][] matrixB = generateMatrix(n);

        System.out.println("Matrix A");
        displayMatrix(matrixA);

        System.out.println("Matrix B");
        displayMatrix(matrixB);

        System.out.println("Matrix A + B");
        addMatrix(matrixA, matrixB);

        System.out.println("Matrix A X B");
        multiplyMatrix(matrixA, matrixB);

    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random rnd = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = rnd.nextInt(10);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }
    }

    public static void addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix1.length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                ans[row][column] = matrix2[row][column] + matrix1[row][column];
            }
        }
        displayMatrix(ans);
    }

    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix1.length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                for (int i = 0; i < matrix1[row].length; i++) {
                    ans[row][column] += matrix1[row][i] * matrix2[i][column];
                }
            }
        }
        displayMatrix(ans);
    }

}

class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genome = "";
        while (!genome.equalsIgnoreCase("quit")) {
            System.out.print("Enter genome string [quit to stop] : ");
            genome = input.nextLine();

            if (genome.equalsIgnoreCase("Quit")) {
                break;
            }

            boolean noGene = true;
            
            while (true) {
                //check the genome has ATG or not
                if (genome.contains("ATG")) {

                    //split the ATG out from the genome and also the genome before it
                    genome = splitATG(genome);

                    String gene = "";
                    //check again if the genome contains ATG, TAG, TGA or TAA
                    //if yes then extract the gene out from the genome
                    gene = splitTXX(genome);

                    //"" means there is not gene in between ATG and TGA,TAA OR TAG
                    //"ATG" means there is ATG in the gene so it is not a gene
                    //gene should be multiple of 3 and should not be 0 length
                    if (!gene.contains("ATG") && !gene.equals("") && gene.length() % 3 == 0 && gene.length() != 0) {
                        System.out.println(gene);
                        noGene = false;
                    }
                } else {
                    break;

                }
            }

            if (noGene) {
                System.out.println("No gene is found");
            }
        }
    }

    public static String splitATG(String genome) {
        return genome.substring(genome.indexOf("ATG") + 3, genome.length());
    }

    public static String splitTAG(String genome) {
        return genome.substring(0, genome.indexOf("TAG"));
    }

    public static String splitTAA(String genome) {
        return genome.substring(0, genome.indexOf("TAA"));
    }

    public static String splitTGA(String genome) {
        return genome.substring(0, genome.indexOf("TGA"));
    }
    
    public static String splitTXX(String genome){
        int indexTAG = genome.indexOf("TAG");
        int indexTGA = genome.indexOf("TGA");
        int indexTAA = genome.indexOf("TAA");
        //if the string doesnt not exist in genome , it will returns - 1
        //check the gene exist or not
        if(indexTAG == -1){
            indexTAG = genome.length() - 1;
        }
        
        if(indexTGA == -1){
            indexTGA = genome.length() - 1;
        }
        
        if(indexTAA == -1){
            indexTAA = genome.length() - 1;
        }
        
        //find the minimum index
        if(indexTAG < indexTGA && indexTAG < indexTAA){
            return splitTAG(genome);
        }else if(indexTGA < indexTAA){
            return splitTGA(genome);
        }else if(indexTAA != indexTGA || indexTAA != indexTAG){
            //because it three gene also doesnt exist then three index would be the same
            return splitTAA(genome);
        }else{
            return "";
        }
    }
}

class Q4 {

    public static void main(String[] args) {
        try {
            Scanner inputStream = new Scanner(new FileInputStream("myAmbition.txt"));
            int[] characterNum = new int[26];
            int sentence = 0;
            int word = 0;
            while (inputStream.hasNextLine()) {
                String line = inputStream.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char character = line.charAt(i);
                    if (Character.isLetter(character)) {
                        character = Character.toUpperCase(character);
                        characterNum[character - 'A'] += 1;
                    }

                    if (character == '.') {
                        sentence++;
                    }
                }
                word += line.split(" ").length;
            }

            System.out.println("Number of senteces : " + sentence);
            System.out.println("Number of words : " + word);
            for (int i = 0; i < characterNum.length; i++) {
                System.out.print((char) (i + 'A') + " : " + characterNum[i] + " ");
                if ((i + 1) % 8 == 0) {
                    System.out.println("");
                }

            }

            inputStream.close();
        } catch (Exception e) {
            System.out.println("Some error occur");
        }
    }
}

class Delivery {

    protected String sender;
    protected String recipient;
    protected double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public double totalCost() {
        double cost = 0;

        if (weight <= 5) {
            cost += weight * 2.8;
        } else if (weight > 5 && weight <= 20) {
            cost += 5 * 2.8 + (weight - 5) * 5.2;
        } else if (weight > 20 && weight <= 50) {
            cost += 5 * 2.8 + 15 * 5.2 + (weight - 20) * 7;
        } else {
            cost += 5 * 2.8 + 15 * 5.2 + 30 * 7 + (weight - 50) * 8.6;
        }

        return cost;
    }

    public String toString() {
        return "From : " + sender
                + " To: " + recipient
                + "\nWeight of Package : " + weight
                + "\nShipping Cost : RM" + totalCost();
    }
}

class SpecialDelivery extends Delivery {

    private boolean weekendDelivery;
    private boolean nightTimeDelivery;
    private static double totalCost = 0;

    public static double getTotalCost() {
        return totalCost;
    }

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekendDelivery, boolean nightTimeDelivery) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
        totalCost += totalCost();
    }

    public double totalCost() {
        double cost = super.totalCost();

        if (weekendDelivery) {
            cost += 50;
        }

        if (nightTimeDelivery) {
            cost *= 1.2;
        }

        return cost;
    }

    public String toString() {
        if (weekendDelivery && nightTimeDelivery) {
            return super.toString() + "\nWeekend Delivery " + "\nNight Time Delivery";
        }

        if (weekendDelivery) {
            return super.toString() + "\nWeekend Delivery";
        }

        if (nightTimeDelivery) {
            return super.toString() + "\nNight Time Delivery";
        }

        return super.toString();
    }

}

class Main {

    public static void main(String[] args) {
        Delivery delivery1 = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        Delivery delivery2 = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        Delivery delivery3 = new SpecialDelivery("FSKTM, UM", "FJ, UM", 32.5, true, false);
        Delivery delivery4 = new SpecialDelivery("Ang", "Liew", 19.0, true, true);

        System.out.println(delivery1.toString());
        System.out.println("");

        System.out.println(delivery2.toString());
        System.out.println("");

        System.out.println(delivery3.toString());
        System.out.println("");

        System.out.println(delivery4.toString());
        System.out.println("");

        System.out.println("The total shipping cost is RM " + SpecialDelivery.getTotalCost());
    }
}
