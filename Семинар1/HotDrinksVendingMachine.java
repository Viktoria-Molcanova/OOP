import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDrinksVendingMachine implements VendingMachines {
    private List<HotDrink> hotDrinks;

    public HotDrinksVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    @Override
    public void Hello() {
        System.out.println("\n___СПИСОК НАПИТКОВ В АССОРТИМЕНТЕ__\n");
    }

    @Override
    public void Goodbye() {
        System.out.println("\n_____СПАСИБО ЗА ПОКУПКУ!_____\n");
    }

    public void shopHotDrinks() {
        Hello();
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("\nВведите напиток \n ");
            for (HotDrink hotDrink2 : hotDrinks) {
                System.out.print(hotDrink2.getDrink() + "\n");
            }
            System.out.print("\nПоле ввода: ");
            String inputHotDrink = scn.nextLine();
            for (HotDrink hotDrink : hotDrinks) {
                if (hotDrink.getDrink().equals(inputHotDrink)) {
                    System.out.println("Стоимость напитка - " + hotDrink.getPrice());
                    System.out.print("Поле для суммы: ");
                    String enterMoney = scn.nextLine();
                    int intMoney = Integer.parseInt(enterMoney);
                    if (intMoney >= hotDrink.getPrice()) {
                        Goodbye();
                        System.out.println(hotDrink);
                        int change = intMoney - hotDrink.getPrice();
                        System.out.println("Возьмите сдачу - " + change);
                    } else {
                        System.out.println("Недостаточно средств");
                    }

                }

            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

}
