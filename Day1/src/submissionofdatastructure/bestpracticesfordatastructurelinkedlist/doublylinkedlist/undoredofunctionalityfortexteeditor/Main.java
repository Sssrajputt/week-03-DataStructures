package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.undoredofunctionalityfortexteeditor;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.displayCurrentState(); // Output: Hello, World!

        editor.undo();
        editor.displayCurrentState(); // Output: Hello

        editor.redo();
        editor.displayCurrentState(); // Output: Hello, World!

        editor.addState("Hello, Universe!");
        editor.displayCurrentState(); // Output: Hello, Universe!

        editor.undo();
        editor.displayCurrentState(); // Output: Hello, World!
    }
}
