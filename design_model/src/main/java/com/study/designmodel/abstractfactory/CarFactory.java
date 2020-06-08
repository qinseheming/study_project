package com.study.designmodel.abstractfactory;

public interface CarFactory {

    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}
