class Students {
    // instance variables
    int id;
    String name;

    // constructor with local variables having same names
    Students(int id, String name) {
        // using 'this' to refer to instance variables
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Third {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Alice");
        s1.display();
    }
}
