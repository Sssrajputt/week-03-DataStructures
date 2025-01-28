package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.singlylinkedlist.studentrecordmanagement;

// Define the Student class
class Student {
    //declairing node data
    int rollNumber;
    String name;
    int age;
    String grade;

    //creating next pointer
    Student next;

    // Constructor to initialize the Student object
    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}
