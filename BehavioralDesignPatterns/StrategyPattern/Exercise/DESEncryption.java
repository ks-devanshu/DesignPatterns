package BehavioralDesignPatterns.StrategyPattern.Exercise;

public class DESEncryption implements Encryptor{
    @Override
    public String encrypt(String message){
        System.out.println("Encrypting message using DES");
        return "Encrypted message DES";
    }
}
