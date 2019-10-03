package uppgift;


public class Hund extends Djur implements Kalkylering {

    // Hund child klassen

    protected int denominator;

    public Hund(double weight) {
        super(weight, "hundfoder");
        this.denominator = 100;
    }

    public Hund(double weight, int denominator, String foodtype) {
        super(weight, foodtype);
        this.denominator = 100;
    }


    // getters and setter provide encapsulation
    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

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




