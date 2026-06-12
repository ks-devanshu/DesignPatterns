package BehavioralDesignPatterns.StatePattern.Exercise;

public class Main {
    public static void main(String[] args) {
        DirectionService service = new DirectionService();
        service.setTravelMode(new DrivingMode());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new BicyclingMode());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new TransitMode());
        service.getEta();
        service.getDirection();

        service.setTravelMode(new WalkingMode());
        service.getEta();
        service.getDirection();
    }
}
