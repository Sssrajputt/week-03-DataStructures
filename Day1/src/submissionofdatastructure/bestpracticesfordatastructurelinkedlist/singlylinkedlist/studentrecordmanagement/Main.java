package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.singlylinkedlist.studentrecordmanagement;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        // Adding student records
        srm.addAtBeginning(1, "John Doe", 20, "A");
        srm.addAtEnd(2, "Jane Smith", 22, "B");
        srm.addAtPosition(3, "Alice Johnson", 21, "A", 1);

        System.out.println(" -------------------");
        // Display all student records
        srm.displayAll();

        // Update a student's grade
        srm.updateGrade(2, "A+");
        System.out.println(" -------------------");

        // Search for a student record by Roll Number
        Student student = srm.searchByRollNumber(3);
        if (student != null) {
            System.out.println("Found: Roll Number: " + student.rollNumber + ", Name: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade);
            System.out.println(" -------------------");
        }

        // Delete a student record by Roll Number
        srm.deleteByRollNumber(1);
        srm.displayAll();
    }
}
