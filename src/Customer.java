import java.util.Scanner;

public class Customer{
    private int age;
    private String firstName;
    private char midInit;
    private String lastName;

    public Customer(){
        age = this.age;
        firstName = this.firstName;
        midInit = this.midInit;
        lastName = this.lastName;
    }

    public Customer(int a, String f, char m, String l){
        age = a;
        firstName = f;
        midInit = m;
        lastName = l;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String f){
        firstName = f;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setMidInit(char m){
        midInit = m;
    }

    public char getMidInit(){
        return midInit;
    }

    public void setLastName(String l){
        lastName = l;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "age: " + age + "First name: " + firstName + "Middle initial : " + midInit + "Last name: " + lastName;
    }

    public void Change(){
        Scanner k = new Scanner(System.in);
        int ans = k.nextInt();
        System.out.println("What would you like to change?\n1. First Name\n2.Middle Initial\n3. Middle Initial ");
        switch(ans){
            case(1):
            System.out.print("What will be the new First Name?");
            String newFirst = k.next();

            setFirstName(newFirst);
            break;

            case(2):
            System.out.print("What will be the new First Name?");
            char newInitial = k.next().charAt(0);

            setMidInit(newInitial);
            break;

            case(3):
            System.out.print("What will be the new First Name?");
            String newLast = k.next();

            setLastName(newLast);
            break;
        }
    }
}