public class Visitor {
    private CentralizedQueue queue;

    public Visitor(CentralizedQueue queue) {
        this.queue = queue;
    }

    public void getQueueNumber() {
        int number = queue.getNextNumber();

        System.out.println("\nYour Queue Number: " + number);
        System.out.println("Please wait for your turn.");
    }
}