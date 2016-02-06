package bleiweiss.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Customer Viewer");

        String displayMore;
        do {
            promptUser();
            System.out.print("\nDisplay another customer? (y/n): ");
            Scanner sc = new Scanner(System.in);
            displayMore = sc.next();
        } while (displayMore.equals("y"));

    }

    public static void promptUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a customer number: ");
        int choice = sc.nextInt();

        CustomerDB db = new CustomerDB();
        Customer theCustomer = db.getCustomer(choice);

        if (theCustomer == null) {
            System.out.println("\nThere is no customer number "
                    + choice + " in our records.");
        } else{
            System.out.println("\n" + theCustomer.getNameAndAddress());
        }
    }

}

