public class Student {
    int id;
    String name;

    // Parameterized constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        // Creating a Student object with specific values
        Student student1 = new Student(1, "Alice");

        // Creating another Student object with different values
        Student student2 = new Student(2, "Bob");
    }
}