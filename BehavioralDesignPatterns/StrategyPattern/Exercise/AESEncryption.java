package BehavioralDesignPatterns.StrategyPattern.Exercise;

public class AESEncryption implements Encryptor{
    @Override
    public String encrypt(String message){
        System.out.println("Encrypting message using AES");
        return "Encrypted message AES";
    }
}
