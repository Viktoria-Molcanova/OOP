
public abstract class Product {
    private String drink;
    private double volume;
   private Boolean syrup;

    public Product(String drink, double volume, Boolean syrup) {
        this.drink = drink;
        this.volume = volume;
        this.syrup = syrup;

    }

    public String getDrink() {
        return drink;
    }

    public double getVolume() {
        return volume;
    }

public Boolean getsyrup() {
return syrup;
    }

}