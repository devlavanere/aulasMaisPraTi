package lesson7_java_ed.simpleLinkedList.exercicio_02;

public class BrowserHistoryMain {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory(3);

        // Visitando URLs
        history.visit("http://youtube.com");
        history.visit("http://google.com");
        history.visit("http://oracle.com");

        // Exibindo o histórico de navegação
        System.out.println("\nBrowsing History:");
        history.displayHistory();

        // Visitando uma nova URL que ultrapassa o limite
        history.visit("http://github.com");

        // Exibindo o histórico de navegação após adicionar uma nova URL e remover a mais antiga
        System.out.println("\nBrowsing History After Visiting New Site:");
        history.displayHistory();
    }
}
