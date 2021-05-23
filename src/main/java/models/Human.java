package models;

public class Human {

    private int weight;
    private int requiredFloor;

    public Human(int weight, int requiredFloor) {
        this.weight = weight;
        this.requiredFloor = requiredFloor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRequiredFloor() {
        return requiredFloor;
    }

    public void setRequiredFloor(int requiredFloor) {
        this.requiredFloor = requiredFloor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", requiredFloor=" + requiredFloor +
                "}";
    }
}
