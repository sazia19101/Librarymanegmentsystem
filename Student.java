package Liberarymanegment;
import java.util.Scanner;

public class Student extends Book {
    private String name;
    private int id;

    public Student(){

    }
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        setName(name);
        System.out.print("Enter student id: ");
        int id = scanner.nextInt();
        setId(id);
    }
}
