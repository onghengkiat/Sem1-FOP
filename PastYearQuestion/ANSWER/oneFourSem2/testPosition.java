class testPosition {
    public static void main(String[] args) {
        int[] b = {95, 100, 74, 66};
        Position a = new Position(b);

        System.out.println("The biggest element in the array is " + a.maxValue + " and its position is at index " + a.whichIndex + ".");
    }
}
