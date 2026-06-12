package BehavioralDesignPatterns.StrategyPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        ChatClient chatClient = new ChatClient();
        chatClient.send("Hello Client", new AESEncryption());
        chatClient.send("How are you?", new DESEncryption());
//        chatClient.send("How are you?", null);
    }
}
