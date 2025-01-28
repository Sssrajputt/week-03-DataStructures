package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTaskAtBeginning(1, "Task 1", 2, "2025-01-30");
        scheduler.addTaskAtEnd(2, "Task 2", 1, "2025-02-15");
        scheduler.addTaskAtPosition(1, 3, "Task 3", 3, "2025-03-01");

        scheduler.displayTasks();

        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();

        scheduler.searchTaskByPriority(1);

        scheduler.removeTaskByID(2);
        scheduler.displayTasks();
    }
}
