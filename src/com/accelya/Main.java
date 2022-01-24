package com.accelya;

import com.accelya.trainerController.TrainerController;
import com.accelya.trainerModel.Trainer;
import com.accelya.trainerView.TrainerView;

public class Main {
    
    private static Trainer getModel() {
        Trainer shakti = new Trainer(001,"Shakti",9);
        return shakti;
    }
    
    
    public static void main(String[] args) {
        
        Trainer model = getModel();
        
        TrainerView view = new TrainerView();
        
        TrainerController controller = new TrainerController(model, view);
        controller.setTrainerName("Manish");
        controller.callView();
        
    }

   

}
