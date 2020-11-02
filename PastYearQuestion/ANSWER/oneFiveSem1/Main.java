class Main{
    public static void main(String[] args) {
        Strength a = new Strength("Chaos Knight", "Strength", 30);
        Ability b = new Ability("Bloodseeker", "Agility", 25);
        a.display();
        b.display();
        System.out.println();
        playGame(a,b);
    }

    public static void playGame(Strength a, Ability b){

        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }

            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }

    public static void playGame(Strength a, Strength b){

        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }

            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }

    public static void playGame(Ability a, Strength b){

        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }

            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }

    public static void playGame(Ability a, Ability b){

        while(a.getHealth() > 0 && b.getHealth() > 0){
            b.damage(b,a);
            if(a.getHealth() <= 0){
                System.out.println(b.getName() + " wins the game!");
                break;
            }

            a.damage(a, b);
            if(b.getHealth() <= 0){
                System.out.println(a.getName() + " wins the game!");
                break;
            }
        }
    }
}
