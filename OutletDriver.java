import java.util.Scanner;

public class OutletDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Outlet outlet = new Outlet();

        char choice2 = '\u0000';
        do {
            System.out.println("Press 1 for Apple");
            System.out.println("Press 2 for Strawberry");
            System.out.println("Press 3 for Mango");

            System.out.println("\n Enter Your Choice : ");
            int choice1 = s.nextInt();

            choice2 = '\u0000';

            switch (choice1) {
                case 1: {
                    System.out.println("Enter Quantity : ");
                    outlet.fruit = new Apple(s.nextInt()); // UPCASTED SCENARIO
                    // outlet.fruit.qty=s.nextInt();
                    break;
                }

                case 2: {
                    System.out.println("Enter Quantity : ");
                    outlet.fruit = new Strawberry(); // UPCASTED SCENARIO
                    outlet.fruit.qty = s.nextInt();
                    break;
                }

                case 3: {
                    System.out.println("Enter Quantity : ");
                    outlet.fruit = new Mango(); // UPCASTED SCENARIO
                    outlet.fruit.qty = s.nextInt();
                    break;
                }

                default: {
                    System.out.println("\n.......INVALID INPUT.......\n");
                    System.out.print("\tDO YOU WANT TO CONTINUE (Y/N) : ");
                    choice2 = s.next().charAt(0);
                }
            }
        } while (choice2 == 'y' || choice2 == 'Y');

        // DISPLAYING PROPERTIES

        System.out.println(outlet.fruit);
        outlet.displayCart();
        int bill = outlet.billGenerator();
        System.out.println("Total Bill : Rs" + bill);

        s.close();

    }
}
