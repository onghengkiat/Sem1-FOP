class Location {
    public int row;
    public int maxValue;

    public Location() {
        row = 0;
        maxValue = 0;
    }

    public Location(int[] integer) {
        this.row = locateMax(integer).row;
        this.maxValue = locateMax(integer).maxValue;
    }

    public static Location locateMax(int[] num) {
        Location a = new Location();
        a.maxValue = num[0];
        a.row = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > a.maxValue) {
                a.maxValue = num[i];
                a.row = i;
            }
        }
        return a;
    }

}
