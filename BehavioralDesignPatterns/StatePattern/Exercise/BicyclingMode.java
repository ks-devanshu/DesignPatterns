package BehavioralDesignPatterns.StatePattern.Exercise;

public class BicyclingMode implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 2;
    }
}
