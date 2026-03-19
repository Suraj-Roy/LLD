package com.project.behavioural_design_pattern.strategy_design_pattern;

public class Main {

    public static void main(String[] args) {
        DeviceStrategy obj1 = new DeviceStrategy(new Mac());
        DeviceStrategy obj2 = new DeviceStrategy(new Windows());

        obj1.renderUi();
        obj2.renderUi();

    }
}
