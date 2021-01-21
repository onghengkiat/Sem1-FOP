import java.util.Scanner;

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

            //determine if gene is found
            boolean noGene = true;

            while (true) {
                //check the genome has ATG or not
                if (genome.contains("ATG")) {

                    //TTAGT
                    //split the ATG out from the genome and also the genome before it
                    genome = splitATG(genome);

                    String gene = "";
                    //check again if the genome contains TAG, TGA or TAA
                    //if yes then extract the gene out from the genome
                    gene = splitTXX(genome);

                    //"" means there is not gene in between ATG and TGA,TAA OR TAG
                    //"ATG" means there is ATG in the gene so it is not a gene
                    //gene should be multiple of 3 and should not be 0 length
                    if (!gene.contains("ATG") && !gene.equals("") && gene.length() % 3 == 0) {
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
        //AASGGAG
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

    public static String splitTXX(String genome) {
        int indexTAG = genome.indexOf("TAG");
        int indexTGA = genome.indexOf("TGA");
        int indexTAA = genome.indexOf("TAA");
        //if the string doesnt not exist in genome , it will returns - 1
        //check the gene exist or not
        if (indexTAG == -1) {
            indexTAG = genome.length() - 1;
        }

        if (indexTGA == -1) {
            indexTGA = genome.length() - 1;
        }

        if (indexTAA == -1) {
            indexTAA = genome.length() - 1;
        }

        //find the minimum index
        if (indexTAG < indexTGA && indexTAG < indexTAA) {
            return splitTAG(genome);
        } else if (indexTGA < indexTAA) {
            return splitTGA(genome);
        } else if (indexTAA != indexTGA || indexTAA != indexTAG) {
            //because it three gene also doesnt exist then three index would be the same
            return splitTAA(genome);
        } else {
            return "";
        }
    }
}
