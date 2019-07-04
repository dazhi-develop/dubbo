package com.sdz.spi.imp;

import com.sdz.spi.Car;

/**
 * @author songdezhi
 */
public class BlueCar implements Car {
    @Override
    public void getColor() {
        System.out.println("blue");
    }
}
