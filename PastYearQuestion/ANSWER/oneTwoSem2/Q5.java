class Q5{
    public static void main(String[] args) {
        int [] b = {4,99,2};
        Location a = new Location(b);

        System.out.println("The location of the biggest element element is at index [" + a.row + "] and the element is " + a.maxValue + ".");
    }
}
