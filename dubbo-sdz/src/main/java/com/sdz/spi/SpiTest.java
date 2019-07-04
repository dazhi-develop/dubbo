package com.sdz.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author songdezhi
 */
public class SpiTest {
    public static void main(String[] args) {
        ExtensionLoader<Car> carExtensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car car = carExtensionLoader.getExtension("red");
        car.getColor();
    }
}
