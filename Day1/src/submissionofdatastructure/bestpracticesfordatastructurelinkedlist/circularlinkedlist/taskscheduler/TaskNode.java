package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.circularlinkedlist.taskscheduler;

class TaskNode {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}