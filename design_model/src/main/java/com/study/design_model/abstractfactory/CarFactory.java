package com.study.design_model.abstractfactory;

public interface CarFactory {

    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}
