package com.project.behavioural_design_pattern.observer_design_pattern;

public class Main {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherServiceImpl();

        weatherService.addObserver(new DisplayDevie());
        weatherService.addObserver(new DigitalDevice());

        weatherService.setTemperature(30.0);
    }
}
