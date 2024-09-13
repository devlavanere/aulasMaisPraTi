package lesson7_java_ed.doublyLinkedList.exercicio_04;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addAction("Type 'Hello'");
        editor.addAction("Type 'World'");
        editor.displayActions();
        editor.undo();
        editor.displayActions();
        editor.redo();
        editor.displayActions();
        editor.undo();
        editor.undo();
        editor.redo();
    }
}
