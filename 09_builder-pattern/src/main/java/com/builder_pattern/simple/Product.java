package com.builder_pattern.simple;

/**
 * 建造者最终建造的产物
 *
 * @author sobann
 */
public class Product {
    /**
     * 产品中的组件A
     */
    private String propertyA;
    /**
     * 产品中的组件B
     */
    private String propertyB;
    /**
     * 产品中的组件C
     */
    private String propertyC;

    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }

    public String getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(String propertyB) {
        this.propertyB = propertyB;
    }

    public String getPropertyC() {
        return propertyC;
    }

    public void setPropertyC(String propertyC) {
        this.propertyC = propertyC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "propertyA='" + propertyA + '\'' +
                ", propertyB='" + propertyB + '\'' +
                ", propertyC='" + propertyC + '\'' +
                '}';
    }
}
