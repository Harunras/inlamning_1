package uppgift;

public class Katt extends Djur implements Kalkylering {
    // Katt child klassen

    protected int denominator;
    protected String footype;

    public Katt(double weight) {
        super(weight, "Kattfoder");
        this.denominator = 150;
    }

    public Katt(double weight, String foodtype) {
        super(weight, foodtype);
        this.denominator = 150;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // getters and setter provide encapsulation

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getFoodType() {
        return super.getFoodType();
    }

    @Override
    public void setFoodType(String foodType) {
        super.setFoodType(foodType);
    }

    // overridden method from interface
    @Override
    public double kalkyleraPortion() {
        return this.getWeight() / this.getDenominator();
    }


}



