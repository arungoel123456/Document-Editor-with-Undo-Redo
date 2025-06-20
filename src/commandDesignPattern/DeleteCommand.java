package commandDesignPattern;

public class DeleteCommand implements Command{
    private StringBuilder document;
    private int length;
    private String deletedText;

    public DeleteCommand(StringBuilder document, int length) {
        this.document = document;
        this.length = length;
    }

    public void execute() {
        int start = document.length() - length;
        if (start < 0) start = 0;
        deletedText = document.substring(start);
        document.delete(start, document.length());
    }

    public void undo() {
        document.append(deletedText);
    }
}
