package PropertiesReader;

public class LiftPropertiesReader extends PropertiesReader{
    private final int maxLiftCapacity;
    private final int startFloor;

    public LiftPropertiesReader() {
        maxLiftCapacity = Integer.parseInt(properties.getProperty("lift.max_capacity"));
        startFloor = Integer.parseInt(properties.getProperty("lift.start_floor"));
    }

    public int getMaxLiftCapacity() {
        return maxLiftCapacity;
    }

    public int getStartFloor() {
        return startFloor;
    }
}
