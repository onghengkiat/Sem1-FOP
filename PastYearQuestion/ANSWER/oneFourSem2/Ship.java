class Ship {
    protected String shipName, yearBuilt;

    public Ship() {

    }

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String toString() {
        return "Ship Name : " + shipName +
                "\nYear Built : " + yearBuilt;
    }
}
