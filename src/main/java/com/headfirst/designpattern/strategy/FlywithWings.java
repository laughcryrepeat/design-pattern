package com.headfirst.designpattern.strategy;

public class FlywithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
