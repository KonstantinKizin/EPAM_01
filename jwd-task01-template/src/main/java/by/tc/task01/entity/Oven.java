package by.tc.task01.entity;

public class Oven extends Appliance{

    private float powerConsumption;

    private float weight;

    private float capacity;

    private float depth;

    private float height;

    private float width;

    public Oven(){

    }


    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oven oven = (Oven) o;

        if (Float.compare(oven.powerConsumption, powerConsumption) != 0) return false;
        if (Float.compare(oven.weight, weight) != 0) return false;
        if (Float.compare(oven.capacity, capacity) != 0) return false;
        if (Float.compare(oven.depth, depth) != 0) return false;
        if (Float.compare(oven.height, height) != 0) return false;
        return Float.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = (powerConsumption != +0.0f ? Float.floatToIntBits(powerConsumption) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (capacity != +0.0f ? Float.floatToIntBits(capacity) : 0);
        result = 31 * result + (depth != +0.0f ? Float.floatToIntBits(depth) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsuption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
