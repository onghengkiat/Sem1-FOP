class CruiseShip extends Ship {
    private int numPassenger;

    public CruiseShip() {
    }

    public CruiseShip(int numPassenger, String shipName, String yearBuilt) {
        super(shipName, yearBuilt);
        this.numPassenger = numPassenger;
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
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
                "\nMaximum Number of Passengers : " + numPassenger;
    }
}
