package by.tc.task01.entity;

public class Speakers extends Appliance{

    private float powerConsumption;

    private int numberOfSpeakers;

    private String frequencyRange;

    private float cordLength;

    public Speakers(){

    }

    public float getCordLength() {
        return cordLength;
    }

    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speakers speakers = (Speakers) o;

        if (Float.compare(speakers.powerConsumption, powerConsumption) != 0) return false;
        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (Float.compare(speakers.cordLength, cordLength) != 0) return false;
        return frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        int result = (powerConsumption != +0.0f ? Float.floatToIntBits(powerConsumption) : 0);
        result = 31 * result + numberOfSpeakers;
        result = 31 * result + frequencyRange.hashCode();
        result = 31 * result + (cordLength != +0.0f ? Float.floatToIntBits(cordLength) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLenght=" + cordLength +
                '}';
    }
}
