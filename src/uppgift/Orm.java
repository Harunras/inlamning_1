package uppgift;

public class Orm extends Djur implements Kalkylering {
    // Orm child klassen
    protected String footype;

    public Orm(double weight) {
        super(weight, "ormpellets");

    }

    public Orm(double weight, String footype) {
        super(weight, footype);

    }

    // getters and setter ger inkapsulation
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
        return 20;
    }




    }

