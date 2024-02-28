
public class HotDrink extends Product {

    int temperature;
    int price;

    public HotDrink(String drink, double volume, Boolean syrup, int temperature, int price) {
        super(drink, volume, syrup);
        this.temperature = temperature;
        this.price = price;
        
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        
        return  "\nНапиток  - " + super.getDrink() + "\nОбъём  - " + super.getVolume() + "\nСироп - " + super.getsyrup() + "\nТемпература - " + temperature + "\nЦена  - " + price +"\n"  ;
    }

}