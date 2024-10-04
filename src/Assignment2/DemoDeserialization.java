package Assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoDeserialization {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ashwi\\File-InputOutput doc\\File.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj1 = ois.readObject();
            Object obj2 = ois.readObject();
            Object obj3 = ois.readObject();

            Emplyoe emp1 = (Emplyoe) obj1;
            System.out.println(emp1);
            Emplyoe emp2 = (Emplyoe) obj2;
            System.out.println(emp2);
            Emplyoe emp3 = (Emplyoe) obj3;
            System.out.println(emp3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}