package com.sdz.spi.imp;

import com.sdz.spi.Car;

/**
 * @author songdezhi
 */
public class BenthCarWrapper implements Car {
    private Car car;

    public BenthCarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColor() {
        System.out.println("nihao benth");
        car.getColor();
    }
}
