package models;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Floor {

    private int number;
    private PriorityQueue<Human> toDown = new PriorityQueue<Human>();
    private PriorityQueue<Human> toUp = new PriorityQueue<Human>();
    private boolean upButtonIsDown = false;
    private boolean downButtonIsDown = false;

    public Floor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PriorityQueue<Human> getToDown() {
        return toDown;
    }

    public void setToDown(PriorityQueue<Human> toDown) {
        this.toDown = toDown;
    }

    public PriorityQueue<Human> getToUp() {
        return toUp;
    }

    public void setToUp(PriorityQueue<Human> toUp) {
        this.toUp = toUp;
    }

    public boolean isUpButtonIsDown() {
        return upButtonIsDown;
    }

    public void setUpButtonIsDown(boolean upButtonIsDown) {
        this.upButtonIsDown = upButtonIsDown;
    }

    public boolean isDownButtonIsDown() {
        return downButtonIsDown;
    }

    public void setDownButtonIsDown(boolean downButtonIsDown) {
        this.downButtonIsDown = downButtonIsDown;
    }
}
