import java.util.*;

public class Market implements MarketBehavior, QueueBehavior {
    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println (" Покупатель " + actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(" Покупатель " + actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(" Покупатель " + actor.getName() + " встал в очередь");
        long time = 3;
        for (int i = (int) time; i >= 0; i--) {
            System.out.println( ((i > 4)? i + " человека перед вами ": (i > 1)? i + " человека перед вами" : (i == 1)? i + " человек перед вами" : ""));
            
        }
        System.out.println("Ваша очередь сделать заказ");
    }
    

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(" Покупатель " + actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(" Покупатель " + actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(" Покупатель " + actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }
}
