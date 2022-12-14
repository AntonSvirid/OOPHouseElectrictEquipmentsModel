package com.company.antonsvirid.model.entity;

import com.company.antonsvirid.model.entity.abstracts.KitchenEquipments;

public class Mixer extends KitchenEquipments {
    public Mixer() {
    }

    public Mixer(String name, int power, int cost, boolean inSet) throws Exception {
        super(name, power, cost, inSet);
    }

    @Override
    public void turnOn() throws Exception{
        if (isInSet() && isTurnOnStatus() == false) {
            setTurnOnStatus(true);
            System.out.println("Mixer was turnon...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }

    @Override
    public void turnOff()  throws Exception{
        if (isInSet() && isTurnOnStatus()) {
            setTurnOnStatus(false);
            System.out.println("Mixer was turnoff...");
        } else {
            System.out.println("error, not correct status");
            throw new Exception();
        }
    }
}
