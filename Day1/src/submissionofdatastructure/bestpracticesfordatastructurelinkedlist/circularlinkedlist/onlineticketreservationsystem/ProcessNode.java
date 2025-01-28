package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.circularlinkedlist.onlineticketreservationsystem;

class ProcessNode {
    int processID;
    int burstTime;
    int priority;
    ProcessNode next;

    ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}