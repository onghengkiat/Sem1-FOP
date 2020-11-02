class TestLocation {
    public static void main(String[] args) {
        int[] b = {95, 100, 64, 66};
        Location a = new Location(b);

        System.out.println("The location of the smallest element element is at index " + a.whichIndex + " and the element is " + a.minValue + ".");
    }
}
