public class Customer {
    protected String name;
    protected String date;
    protected int room;

    public void displayCustomerInfo(String name, String date, int room) {
        this.name = name;
        this.date = date;
        this.room = room;

        System.out.println("Customer: " + name);
        System.out.println("Date of Booking: " + date);
        System.out.println("Assigned Room: " + room);
        
    }

    protected void displayFloorInfo() {
        if (room <= 10)
            System.out.println("The assigned room is on the 1st floor");
        else if (room <= 20)
            System.out.println("The assigned room is on the 2nd floor");
        else if (room <= 30)
            System.out.println("The assigned room is on the 3rd floor");
        else if (room <= 40)
            System.out.println("The assigned room is on the 4th floor");
        else if (room <= 50)
            System.out.println("The assigned room is on the 5th floor");
        else
            System.out.println("The assigned room is on a higher floor");
    }
}
