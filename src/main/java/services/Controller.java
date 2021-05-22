package services;

import models.Building;
import models.Elevator;
import models.Floor;
import models.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public void control(Building building){
        checkButtons(building);

    }

    public void checkButtons(Building building){
        boolean needToTurnOn;
        for(Floor f:building.getFloors()){
            if(f.isUpButtonIsPressed()){
                needToTurnOn = true;
                for(Elevator e:building.getElevators()){
                    if(e.getLocation() <= f.getNumber() && e.getGoingVector() > 0){
                        needToTurnOn = false;
                        break;
                    }
                }
                if(needToTurnOn){
                    for(Elevator e:building.getElevators()){
                        if(e.getGoingVector() == 0){
                            // turn on
                            if(e.getLocation() < f.getNumber()){
                                e.setGoingVector(1);
                            }
                            if(e.getLocation() > f.getNumber()){
                                e.setGoingVector(-1);
                            }
                            break;
                        }
                    }
                }
            }
            if(f.isDownButtonIsPressed()){
                needToTurnOn = true;
                for(Elevator e:building.getElevators()){
                    if(e.getLocation() >= f.getNumber() && e.getGoingVector() < 0){
                        needToTurnOn = false;
                        break;
                    }
                }
                if(needToTurnOn){
                    for(Elevator e:building.getElevators()){
                        if(e.getGoingVector() == 0){
                            //turn on
                            if(e.getLocation() < f.getNumber()){
                                e.setGoingVector(1);
                            }
                            if(e.getLocation() > f.getNumber()){
                                e.setGoingVector(-1);
                            }
                            break;
                        }
                    }
                }
            }
        }
        logger.debug("Controller checked buttons ");
    }

    public void checkElevator(Elevator elevator, Building building){
        if(elevator.isDoorsOpen()){
            for (Human h:elevator.getHumans()){
                if(h.getRequiredFloor() == elevator.getLocation()){
                    elevator.getHumans().remove(h);
                }
            }
            if(elevator.getGoingVector() >= 0){
                for(Human h:building.getFloors().get(elevator.getLocation()).getToUp()){
                    if(h.getWeight()+elevator.getOccupiedCapacity() <= elevator.getLiftingCapacity()){
                        elevator.getHumans().add(h);
                    } else {
                        break;
                    }
                }
            }
            if(elevator.getGoingVector() < 0){
                for(Human h:building.getFloors().get(elevator.getLocation()).getToDown()){
                    if(h.getWeight()+elevator.getOccupiedCapacity() <= elevator.getLiftingCapacity()){
                        elevator.getHumans().add(h);
                    } else {
                        break;
                    }
                }
            }
            elevator.setDoorsOpen(false);
            logger.debug("Check elevator - elevator - "+elevator+" door is closed");
        } else {
            boolean needToOpenDoors = false;
            for(Human h:elevator.getHumans()){
                if(elevator.getLocation() == h.getRequiredFloor()){
                    needToOpenDoors = true;
                    break;
                }
            }
            if(elevator.getGoingVector() >= 0){
                if(!building.getFloors().get(elevator.getLocation()).getToUp().isEmpty()){
                    needToOpenDoors = true;
                }
            }
            if(elevator.getGoingVector() < 0){
                if(!building.getFloors().get(elevator.getLocation()).getToDown().isEmpty()){
                    needToOpenDoors = true;
                }
            }
            if(needToOpenDoors){
                elevator.setDoorsOpen(true);
                logger.debug("Check elevator - elevator - "+elevator+" door is open");
                return;
            }
            logger.debug("Check elevator - elevator - "+elevator+" door is not open");
        }
    }
}
