package Assignment2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
    public static void main(String[] args) {

        Emplyoe emp1= new Emplyoe(101, "Ashish");
        Emplyoe emp2= new Emplyoe(102, "Gana");
        Emplyoe emp3 = new Emplyoe(103, "Sam");

        try {

            File file= new File("C:\\Users\\ashwi\\File-InputOutput doc\\File.txt");
            FileOutputStream fos= new FileOutputStream(file);
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(emp1);
            oos.writeObject(emp2);
            oos.writeObject(emp3);
            oos.flush();
            oos.close();
            System.out.println("done!!");
        } catch (Exception e) {

            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
