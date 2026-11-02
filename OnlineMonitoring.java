public class OnlineMonitoring {
    private CentralizedQueue queue;

    public OnlineMonitoring(CentralizedQueue queue) {
        this.queue = queue;
    }

    public void displayCurrentNumber() {
        System.out.println("\n=== ONLINE QUEUE MONITORING ===");
        System.out.println("Current Queue Number: "
                + queue.getCurrentNumber());
    }
}