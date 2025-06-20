import com.demo.DocumentEditor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DocumentEditor editor = new DocumentEditor();

        editor.type("Hello");
        editor.print();

        editor.type(" World");
        editor.print();

        editor.undo();
        editor.print();

        editor.redo();
        editor.print();

        editor.delete(6);
        editor.print();

        editor.undo();
        editor.print();
    }
}