import java.util.Scanner;

public class hotel extends Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of customers");
        int numOfCustomers = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < numOfCustomers; i++) {
            System.out.println("Enter the customer name:");
            String name = scanner.nextLine();
            System.out.println("Enter the Date of booking (dd-mm-yyyy):");
            String date = scanner.nextLine();
            System.out.println("Enter the customer assigned room:");
            int room = scanner.nextInt();
            scanner.nextLine(); 

           
            hotel hotelObj = new hotel();
            hotelObj.displayCustomerInfo(name, date, room);
            hotelObj.displayFloorInfo();
        }
    }
}
