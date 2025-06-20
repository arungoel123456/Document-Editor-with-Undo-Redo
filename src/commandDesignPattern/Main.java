package commandDesignPattern;

public class Main {
    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        editor.executeCommand(new TypeCommand(editor.getDocumentText(), "Hellooooo"));
        editor.print();

        editor.executeCommand(new TypeCommand(editor.getDocumentText(), " World"));
        editor.print();

        editor.undo();
        editor.print();

        editor.redo();
        editor.print();

        editor.executeCommand(new DeleteCommand(editor.getDocumentText(), 6));
        editor.print();

        editor.undo();
        editor.print();
    }
}
