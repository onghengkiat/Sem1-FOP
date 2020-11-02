class Pizza {

    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;

    public Pizza() {
    }

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping) {
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public double computeCost() {
        double cost = 2 * (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping);
        ;

        if (size.equalsIgnoreCase("Small")) {
            cost += 10;
        } else if (size.equalsIgnoreCase("Medium")) {
            cost += 12;
        } else if (size.equalsIgnoreCase("Large")) {
            cost += 14;
        }

        return cost;
    }

    public String toString() {
        return "Pizza size      :  " + size
                + "\ncheese topping  :  " + numOfCheeseTopping
                + "\nbeef topping    :  " + numOfBeefTopping
                + "\nchicken topping :  " + numOfChickenTopping
                + "\n\nPizza cost      :  $" + computeCost();
    }
}
