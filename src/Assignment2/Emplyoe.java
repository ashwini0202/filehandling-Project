package Assignment2;

import java.io.Serializable;

public class Emplyoe implements Serializable {

   private int id;

    public Emplyoe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emplyoe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    }

