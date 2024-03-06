
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        System.out.println("Добро пожаловать в магазин! Введите имя:  ");
        Scanner sc = new Scanner(System.in);
        hm.name = sc.nextLine();
       
       
        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}
