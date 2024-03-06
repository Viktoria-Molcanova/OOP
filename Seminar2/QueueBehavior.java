

public interface QueueBehavior {
    void takeInQueue(Actor actor) throws InterruptedException;
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
