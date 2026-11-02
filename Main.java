import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CentralizedQueue queue = new CentralizedQueue();

        Visitor visitor = new Visitor(queue);

        HelpDesk desk1 = new HelpDesk("HELP DESK 1", queue);
        HelpDesk desk2 = new HelpDesk("HELP DESK 2", queue);
        HelpDesk desk3 = new HelpDesk("HELP DESK 3", queue);

        OnlineMonitoring monitor = new OnlineMonitoring(queue);

        int choice = -1;

        while (choice != 0) {
            System.out.println("\n================================");
            System.out.println(" PAG-IBIG QUEUING SYSTEM");
            System.out.println("================================");
            System.out.println("1. Visitor - Get Queue Number");
            System.out.println("2. Help Desk 1 - Get Number");
            System.out.println("3. Help Desk 2 - Get Number");
            System.out.println("4. Priority Desk 1 - Get Number");
            System.out.println("5. Reset Queue Number");
            System.out.println("6. Online Queue Monitoring");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                input.next();
                continue;
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    visitor.getQueueNumber();
                    break;

                case 2:
                    desk1.getQueueNumber();
                    break;

                case 3:
                    desk2.getQueueNumber();
                    break;

                case 4:
                    desk3.getQueueNumber();
                    break;

                case 5:
                    System.out.print("Enter new queue number: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid queue number.");
                        input.next();
                        break;
                    }

                    int number = input.nextInt();

                    if (number < 0) {
                        System.out.println(
                                "Queue number cannot be negative.");
                        break;
                    }

                    System.out.println("Select help desk:");
                    System.out.println("1. Help Desk 1");
                    System.out.println("2. Help Desk 2");
                    System.out.println("3. Help Desk 3");
                    System.out.print("Enter station: ");

                    if (!input.hasNextInt()) {
                        System.out.println("Invalid station.");
                        input.next();
                        break;
                    }

                    int station = input.nextInt();

                    switch (station) {
                        case 1:
                            desk1.resetQueue(number);
                            break;
                        case 2:
                            desk2.resetQueue(number);
                            break;
                        case 3:
                            desk3.resetQueue(number);
                            break;
                        default:
                            System.out.println("Invalid station.");
                    }
                    break;

                case 6:
                    monitor.displayCurrentNumber();
                    break;

                case 0:
                    System.out.println("System closed. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}