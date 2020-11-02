class ShippedOrder extends Order {

    public double computeTotalPrice() {
        return quantityOrdered * unitPrice + 4;
    }

    public ShippedOrder(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return "Shipped\nOrder record"
                + "\nCustomer Name : " + customerName
                + "\nCustomer ID : " + customerID
                + "\nQuantity ordered : " + quantityOrdered
                + "\nUnit price : " + unitPrice
                + "\nTotal price : " + computeTotalPrice();
    }
}
