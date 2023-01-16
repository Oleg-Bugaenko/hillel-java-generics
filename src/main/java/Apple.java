public class Apple extends Fruit {
    private String nameFruit;
    private int amount;
    private double unitWeight;


    public Apple(String nameFruit, int amount, double unitWeight) {
        weight = unitWeight * amount;
        this.nameFruit = nameFruit;
        this.amount = amount;
        this.unitWeight = unitWeight;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public int getAmount() {
        return amount;
    }

    public double getWeight() {
        return weight;
    }

}
