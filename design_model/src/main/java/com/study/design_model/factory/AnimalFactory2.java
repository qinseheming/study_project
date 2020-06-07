package com.study.design_model.factory;

/**
 * 通过反射实现简单工厂
 * 优点：每次新增类时不需要再修改工厂类的代码
 */
public class AnimalFactory2 {

    public static <T> T getAnimal(Class<? extends Animal> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
