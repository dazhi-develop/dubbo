package com.sdz.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author songdezhi
 */
@SPI
public interface Car {
    /**
     * 获取颜色
     *
     * @return 颜色
     *
     */
    void getColor();
}
