import java.util.Scanner;
import java.io.IOException;

public class App implements Interface{
    public static void main(String[] args) throws Exception {

        Scanner k = new Scanner(System.in);

        System.out.println("Welcome.\n Would you like to:\n1. Create a new Accout\n2. Change Information");

        int ans = k.nextInt();

        Customer John = new Customer(25, "John", 'R', "Brown");

        Customer c = John;

        switch(ans){
            case(1):
            
            case(2):
                Change(c);

        }

    }

    public static void Change(Customer c){
        Scanner k = new Scanner(System.in);
        System.out.println("What would you like to change?\n1. First Name\n2.Middle Initial\n3. Middle Initial ");
        int ans = k.nextInt();
        switch(ans){
            case(1):
            System.out.print("What will be the new First Name?");
            String newFirst = k.next();

            c.setFirstName(newFirst);
            break;

            case(2):
            System.out.print("What will be the new First Name?");
            char newInitial = k.next().charAt(0);

            c.setMidInit(newInitial);
            break;

            case(3):
            System.out.print("What will be the new First Name?");
            String newLast = k.next();

            c.setLastName(newLast);
            break;
        }
        Interface.overwriteText(c);
    }
}
