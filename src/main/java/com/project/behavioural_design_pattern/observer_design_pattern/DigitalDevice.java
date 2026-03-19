package com.project.behavioural_design_pattern.observer_design_pattern;

public class DigitalDevice implements Observer{

    @Override
    public void telecastWeather(double temperature) {
        System.out.println("I am from the digital display device :"+temperature);
    }
}
