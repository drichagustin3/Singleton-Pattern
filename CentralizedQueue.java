public class CentralizedQueue {
    private int queueNumber = 0;

    public synchronized int getNextNumber() {
        queueNumber++;
        return queueNumber;
    }

    public synchronized void resetQueue(int number) {
        queueNumber = number;
    }

    public synchronized int getCurrentNumber() {
        return queueNumber;
    }
}