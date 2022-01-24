package com.accelya.trainerController;

import com.accelya.trainerModel.Trainer;
import com.accelya.trainerView.TrainerView;

public class TrainerController {
    private Trainer model;
    private TrainerView view;
    
    public TrainerController(Trainer model, TrainerView view) {
        super();
        this.model = model;
        this.view = view;
    }
    
    public void setTrainerName(String name) {
        model.setName(name);
    }
    String getTrainerName() {
        return model.getName();
    }
    
    void setTrainerId(int id) {
        model.setId(id);
    }
    int getTrainerId() {
        return model.getId();
    }
    
    void setTrainerExp(int exp) {
        model.setId(exp);
    }
    int getTrainerExp() {
        return model.getExp();
    }
    
    public void callView() {
        view.callingView(model.getId(),model.getName(),model.getExp());
    }
}
