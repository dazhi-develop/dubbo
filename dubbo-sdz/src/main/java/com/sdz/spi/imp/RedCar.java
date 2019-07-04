package com.sdz.spi.imp;

import com.sdz.spi.Car;

/**
 * @author songdezhi
 */
public class RedCar implements Car {
    @Override
    public void getColor() {
        System.out.println("red");
    }
}
