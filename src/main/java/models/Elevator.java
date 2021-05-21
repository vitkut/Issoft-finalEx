package models;

public class Elevator {

    private int location;
    private boolean isDoorsOpen;
    private int liftingCapacity;
    private int speed;
    private int doorsSpeed;

    public Elevator(int location, int liftingCapacity, int speed, int doorsSpeed) {
        this.location = location;
        this.liftingCapacity = liftingCapacity;
        this.speed = speed;
        this.doorsSpeed = doorsSpeed;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public boolean isDoorsOpen() {
        return isDoorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        isDoorsOpen = doorsOpen;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoorsSpeed() {
        return doorsSpeed;
    }

    public void setDoorsSpeed(int doorsSpeed) {
        this.doorsSpeed = doorsSpeed;
    }
}
