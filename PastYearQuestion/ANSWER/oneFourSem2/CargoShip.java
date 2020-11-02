class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip() {
    }

    public CargoShip(int cargoCapacity, String shipName, String yearBuilt) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
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
                "\nCargo Capacity : " + cargoCapacity;
    }
    //question d draw UML diagram lazy to do liao too many things
}
