package services;

import models.Building;
import models.Floor;

public class ButtonPusher {

    public static void press(Building building){
        for(Floor f:building.getFloors()){
            if(!f.isUpButtonIsPressed() && !f.getToUp().isEmpty()){
                f.setUpButtonIsPressed(true);
            }
            if(!f.isDownButtonIsPressed() && !f.getToDown().isEmpty()){
                f.setDownButtonIsPressed(true);
            }
        }
    }

}
