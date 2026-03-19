package com.project.behavioural_design_pattern.observer_design_pattern;

public class DisplayDevie implements Observer{

    @Override
    public void telecastWeather(double temperature) {
       System.out.println("I am from the display device :"+temperature);
    }
}
