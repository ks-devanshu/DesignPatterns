package BehavioralDesignPatterns.StrategyPattern.Exercise;

public class ChatClient {
    public void send(String message, Encryptor encryptionAlgo) {
        if (encryptionAlgo == null)
            throw new UnsupportedOperationException("Unsupported encryption algorithm");

        String encryptedMessage = encryptionAlgo.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
