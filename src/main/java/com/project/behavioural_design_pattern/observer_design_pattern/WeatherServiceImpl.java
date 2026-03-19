package com.project.behavioural_design_pattern.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherServiceImpl implements WeatherService{

    private Double temperature;
    private List<Observer> observerList;



    public WeatherServiceImpl() {
        this.observerList = new ArrayList<>();
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        forcastTemperature();
    }

    public void addObserver( Observer observer){
        observerList.add(observer);
    }

    public void removeObserver( Observer observer){
        observerList.remove(observer);
    }

    public void forcastTemperature(){
        for(Observer obs: observerList){
            obs.telecastWeather(temperature);
        }
    }


}
