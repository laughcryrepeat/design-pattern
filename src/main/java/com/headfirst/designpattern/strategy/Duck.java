package com.headfirst.designpattern.strategy;

public abstract class Duck {

    // 행동 인터페이스를 변수로 지정합니다.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
