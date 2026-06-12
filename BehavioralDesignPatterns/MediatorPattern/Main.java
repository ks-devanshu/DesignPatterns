package BehavioralDesignPatterns.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        var dialogBox = new ArticlesDialogBox();
        dialogBox.simulateInteraction();
    }
}
