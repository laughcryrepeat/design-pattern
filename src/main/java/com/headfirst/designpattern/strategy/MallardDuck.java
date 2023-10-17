package com.headfirst.designpattern.strategy;

public class MallardDuck extends Duck {

    // 생성자로 인스턴스 생성시 행위 인터페이스를 구현해 종류별 구체적 행동을 구현합니다.
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlywithWings();
    }
}
