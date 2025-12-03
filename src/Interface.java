import java.io.FileWriter;
import java.io.IOException;

public interface Interface {
    public static void addToText(Customer c){
        try{
            FileWriter fw = new FileWriter("info.txt", true);
            fw.write(c.toString() + System.lineSeparator());
            fw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void overwriteText(Customer c){
        try{
            FileWriter fw = new FileWriter("info.txt");
            fw.write(c.toString());
            fw.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
