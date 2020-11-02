class Location {
    public int whichIndex;
    public int minValue;

    public Location() {
        whichIndex = 0;
        minValue = 0;
    }

    public Location(int[] integer) {
        this.whichIndex = locateMin(integer).whichIndex;
        this.minValue = locateMin(integer).minValue;
    }

    public static Location locateMin(int[] num) {
        Location a = new Location();
        a.minValue = num[0];
        a.whichIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < a.minValue) {
                a.minValue = num[i];
                a.whichIndex = i;
            }
        }
        return a;
    }

}
