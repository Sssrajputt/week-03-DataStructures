package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.doublylinkedlist.undoredofunctionalityfortexteeditor;

class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}