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
            c.Change();

        }

    }
}
