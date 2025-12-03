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
        return "age: " + age + " First name: " + firstName + " Middle initial : " + midInit + " Last name: " + lastName;
    }
}