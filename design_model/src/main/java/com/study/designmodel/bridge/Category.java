package com.study.designmodel.bridge;

/**
 * 分类
 *
 * @author yang
 */
public abstract class Category {

    protected Brand brand;

    public Category(Brand brand) {
        this.brand = brand;
    }

    public void category() {
        brand.brand();
    }

}
