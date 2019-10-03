package uppgift;


public class Djur {
    // grund klass
    double weight;
    String foodType;

    public Djur(double weight, String foodType) {
        this.weight = weight;
        this.foodType = foodType;
    }

    // getters och setters ger inkapsulation

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}