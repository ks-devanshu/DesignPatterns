package StatePattern.Exercise;

public class DrivingMode implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (Driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Driving)");
        return 1;
    }
}
