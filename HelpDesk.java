public class HelpDesk {
    private String stationName;
    private CentralizedQueue queue;

    public HelpDesk(String stationName, CentralizedQueue queue) {
        this.stationName = stationName;
        this.queue = queue;
    }

    public void getQueueNumber() {
        int number = queue.getNextNumber();

        System.out.println("\n" + stationName);
        System.out.println("Queue Number: " + number);
    }

    public void resetQueue(int number) {
        queue.resetQueue(number);

        System.out.println("\n" + stationName);
        System.out.println("Queue number reset to: " + number);
    }
}