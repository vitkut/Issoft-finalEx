package services;

import models.Building;
import models.Human;

public class HumanCreator {

    public static void createRandomHuman(Building building){
        int floor = (int) (Math.random()*building.getNumberOfFloors());
        int weight = ((int) (Math.random()*80))+40;
        int reqFloor = (int) (Math.random()*building.getNumberOfFloors());
        if(reqFloor == floor){
            if(Math.random() > 0.5){
                reqFloor++;
            } else {
                reqFloor--;
            }
        }
        Human newHuman = new Human(weight, reqFloor);
        if(floor < reqFloor){
            //up
            building.getFloors().get(floor).getToUp().add(newHuman);
        } else {
            //down
            building.getFloors().get(floor).getToDown().add(newHuman);
        }
    }

}
