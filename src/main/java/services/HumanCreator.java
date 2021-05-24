package services;

import models.Building;
import models.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanCreator {

    private static final Logger logger = LoggerFactory.getLogger(HumanCreator.class);

    public static void createRandomHuman(Building building){
        int floor = (int) (Math.random()*building.getNumberOfFloors());
        int weight = ((int) (Math.random()*80))+40;
        int reqFloor = (int) (Math.random()*building.getNumberOfFloors());
        if(building.getNumberOfFloors() > 1){
            while (reqFloor == floor){
                reqFloor = (int) (Math.random()*building.getNumberOfFloors());
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
        logger.debug("Human created - "+newHuman+" - in floor - "+floor);
    }

}
