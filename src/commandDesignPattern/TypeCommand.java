package commandDesignPattern;

public class TypeCommand implements Command{
    private StringBuilder document;
    private String text;

    public TypeCommand(StringBuilder document, String text) {
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.append(text);
    }

    @Override
    public void undo() {
        int start = document.length() - text.length();
        document.delete(start, document.length());
    }
}
