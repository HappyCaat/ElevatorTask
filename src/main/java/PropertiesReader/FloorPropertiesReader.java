package PropertiesReader;

public class FloorPropertiesReader extends PropertiesReader{
    private int minQueueCount;
    private int maxQueueCount;

    public FloorPropertiesReader() {
        minQueueCount = Integer.parseInt(properties.getProperty("building.floor_min_queue"));
        maxQueueCount = Integer.parseInt(properties.getProperty("building.floor_max_queue"));
    }

    public int getMinQueueCount() {
        return minQueueCount;
    }

    public int getMaxQueueCount() {
        return maxQueueCount;
    }
}
