class Position {
    public int whichIndex;
    public int maxValue;

    public Position() {
        whichIndex = 0;
        maxValue = 0;
    }

    public Position(int[] integer) {
        this.whichIndex = PositionFindMax(integer).whichIndex;
        this.maxValue = PositionFindMax(integer).maxValue;
    }

    public static Position PositionFindMax(int[] num) {
        Position a = new Position();
        a.maxValue = num[0];
        a.whichIndex = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > a.maxValue) {
                a.maxValue = num[i];
                a.whichIndex = i;
            }
        }
        return a;
    }

}
