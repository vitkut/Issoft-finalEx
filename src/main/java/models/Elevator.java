package models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;

public class Elevator {

    private static final Logger logger = LoggerFactory.getLogger(Elevator.class);

    private int location;
    private boolean isDoorsOpen;
    private int liftingCapacity;
    private int speed;
    private int doorsSpeed;
    private int occupiedCapacity;
    private ArrayList<Human> humans;
    private int goingVector; //-1 / 0 / 1

    public Elevator(int location, int liftingCapacity, int speed, int doorsSpeed) {
        this.location = location;
        this.liftingCapacity = liftingCapacity;
        this.speed = speed;
        this.doorsSpeed = doorsSpeed;
        this.isDoorsOpen = false;
        this.goingVector = 0;
        this.occupiedCapacity = 0;
        humans = new ArrayList<Human>();
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

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    public int getGoingVector() {
        return goingVector;
    }

    public void setGoingVector(int goingVector) {
        this.goingVector = goingVector;
        logger.debug("going vector set to "+goingVector);

    }

    public int getOccupiedCapacity() {
        return occupiedCapacity;
    }

    public void setOccupiedCapacity(int occupiedCapacity) {
        this.occupiedCapacity = occupiedCapacity;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "\n\tlocation=" + location +
                ", \n\tisDoorsOpen=" + isDoorsOpen +
                ", \n\tliftingCapacity=" + liftingCapacity +
                ", \n\tspeed=" + speed +
                ", \n\tdoorsSpeed=" + doorsSpeed +
                ", \n\toccupiedCapacity=" + occupiedCapacity +
                ", \n\thumans=" + humans +
                ", \n\tgoingVector=" + goingVector +
                "\n}";
    }
}
