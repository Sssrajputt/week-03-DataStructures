package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.undoredofunctionalityfortexteeditor;

class TextEditor {
    private TextState head;
    private TextState tail;
    private TextState current;
    private int maxHistorySize;
    private int currentSize;

    TextEditor(int maxHistorySize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.maxHistorySize = maxHistorySize;
        this.currentSize = 0;
    }

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;

        if (head == null) {
            head = tail = current;
        } else if (tail.next == current) {
            tail = current;
        }

        if (currentSize == maxHistorySize) {
            head = head.next;
            head.prev = null;
        } else {
            currentSize++;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentState() {
        return current != null ? current.content : "";
    }

    public void displayCurrentState() {
        System.out.println("Current State: " + getCurrentState());
    }
}
