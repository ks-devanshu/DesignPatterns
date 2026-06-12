package BehavioralDesignPatterns.VisitorPattern.Exercise;

public class Main {
    public static void main(String[] args) {
        WavFile.read("File 1").execute(new AddReverbFilter());
    }
}
