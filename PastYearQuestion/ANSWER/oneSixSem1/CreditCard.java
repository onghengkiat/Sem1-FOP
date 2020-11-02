class CreditCard {
    protected String name;
    protected String cardNumber;
    protected String cardType;
    protected double totalReward;

    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public double getTotalReward() {
        return totalReward;
    }

    public void setTotalReward(double totalReward) {
        this.totalReward = totalReward;
    }

    public String toString() {
        return "Credit Card : " + name + " (" + cardNumber + ")" +
                "\nCard Type : " + cardType +
                "\nTotal Cash Reward : " + totalReward;
    }

}
