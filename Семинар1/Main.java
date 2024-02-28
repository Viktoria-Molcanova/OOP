public class Main {
    public static void main(String[] args) {

        HotDrink Latte = new HotDrink("Latte", 0.2, true, 60, 200);
        HotDrink Tea = new HotDrink("Tea", 0.4, false, 80, 130);
        HotDrink Cappuccino = new HotDrink("Cappuccino", 0.5, true, 50, 100);
        HotDrink Cacao = new HotDrink("Cacao", 0.2, true, 60, 100);
        HotDrink Americano = new HotDrink("Americano", 0.4, true, 80, 110);
        HotDrink Hot_Chocolate = new HotDrink("Hot_Chocolate", 0.5, false, 50, 150);
        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(Latte);
        hotDrVenMach.addHotDrinks(Tea);
        hotDrVenMach.addHotDrinks(Cacao);
        hotDrVenMach.addHotDrinks(Cappuccino);
        hotDrVenMach.addHotDrinks(Americano);
        hotDrVenMach.addHotDrinks(Hot_Chocolate);
        System.out.println(hotDrVenMach.getHotDrinks());
        hotDrVenMach.shopHotDrinks();

    }
}
