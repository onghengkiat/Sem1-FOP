class Durian extends onefoursem1.Fruit {
    private double weight;

    public Durian(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    public double totalPrice() {
        if(type.equalsIgnoreCase("Musang King")){
            return 28*weight;
        }else if (type.equalsIgnoreCase("Udang Merah")){
            return 25*weight;
        }else if(type.equalsIgnoreCase("D24")){
            return 22*weight;
        }else if(type.equalsIgnoreCase("Mas Pahang")){
            return 18*weight;
        }else{
            return 0;
        }
    }

    public void display(){
        super.display();
        System.out.println(weight + " KG - RM " + totalPrice());
    }
}
