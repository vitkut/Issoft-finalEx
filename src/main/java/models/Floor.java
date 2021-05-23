package models;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Floor {

    private int number;
    private LinkedList<Human> toDown = new LinkedList<Human>();
    private LinkedList<Human> toUp = new LinkedList<Human>();
    private boolean upButtonIsPressed = false;
    private boolean downButtonIsPressed = false;

    public Floor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LinkedList<Human> getToDown() {
        return toDown;
    }

    public void setToDown(LinkedList<Human> toDown) {
        this.toDown = toDown;
    }

    public LinkedList<Human> getToUp() {
        return toUp;
    }

    public void setToUp(LinkedList<Human> toUp) {
        this.toUp = toUp;
    }

    public void addToUp(Human human){
        toUp.add(human);
        upButtonIsPressed = true;
    }

    public void addToDown(Human human){
        toDown.add(human);
        downButtonIsPressed = true;
    }

    public boolean isUpButtonIsPressed() {
        return upButtonIsPressed;
    }

    public void setUpButtonIsPressed(boolean upButtonIsPressed) {
        this.upButtonIsPressed = upButtonIsPressed;
    }

    public boolean isDownButtonIsPressed() {
        return downButtonIsPressed;
    }

    public void setDownButtonIsPressed(boolean downButtonIsPressed) {
        this.downButtonIsPressed = downButtonIsPressed;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "number=" + number +
                ", toDown=" + toDown +
                ", toUp=" + toUp +
                ", upButtonIsPressed=" + upButtonIsPressed +
                ", downButtonIsPressed=" + downButtonIsPressed +
                "}";
    }
}
