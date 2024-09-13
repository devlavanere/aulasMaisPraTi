package lesson7_java_ed.simpleLinkedList.exercicio_03;

public class UndoSystemMain {
    public static void main(String[] args) {
        UndoSystem undoSystem = new UndoSystem();

        // Realizando ações
        undoSystem.addAction("Type 'Hello'");
        undoSystem.addAction("Type 'World'");
        undoSystem.addAction("Delete last word");

        // Exibindo todas as ações realizadas
        System.out.println("\nActions Performed:");
        undoSystem.displayActions();

        // Desfazendo uma ação
        undoSystem.undo();

        // Exibindo as ações após desfazer a última
        System.out.println("\nActions After Undo:");
        undoSystem.displayActions();

        // Desfazendo mais uma ação
        undoSystem.undo();

        // Exibindo as ações restantes
        System.out.println("\nActions After Another Undo:");
        undoSystem.displayActions();
    }
}
