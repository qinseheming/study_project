package com.study.design_model.decorator;

/**
 * 装饰模式的具体组件
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("在陆地上跑");
    }
}
