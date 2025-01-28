package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.circularlinkedlist.taskscheduler;


class TaskScheduler {
    private TaskNode head;
    private TaskNode current;

    TaskScheduler() {
        this.head = null;
        this.current = null;
    }

    public void addTaskAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
        } else {
            TaskNode tail = getTail();
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtEnd(int taskID, String taskName, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
        } else {
            TaskNode tail = getTail();
            tail.next = newTask;
            newTask.next = head;
        }
    }

    public void addTaskAtPosition(int position, int taskID, String taskName, int priority, String dueDate) {
        if (position == 0) {
            addTaskAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        TaskNode newTask = new TaskNode(taskID, taskName, priority, dueDate);
        TaskNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == head) {
                return; // Position is out of bounds
            }
        }
        newTask.next = current.next;
        current.next = newTask;
    }

    public void removeTaskByID(int taskID) {
        if (head == null) {
            return;
        }
        if (head.taskID == taskID) {
            TaskNode tail = getTail();
            head = head.next;
            tail.next = head;
            current = head;
            return;
        }
        TaskNode current = head;
        while (current.next != head && current.next.taskID != taskID) {
            current = current.next;
        }
        if (current.next.taskID == taskID) {
            current.next = current.next.next;
        }
    }

    public void viewCurrentTask() {
        if (current != null) {
            System.out.println("Current Task ID: " + current.taskID + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode current = head;
        do {
            System.out.println("Task ID: " + current.taskID + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        TaskNode current = head;
        boolean found = false;
        do {
            if (current.priority == priority) {
                System.out.println("Task ID: " + current.taskID + ", Task Name: " + current.taskName + ", Priority: " + current.priority + ", Due Date: " + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

    private TaskNode getTail() {
        if (head == null) {
            return null;
        }
        TaskNode current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }
}
