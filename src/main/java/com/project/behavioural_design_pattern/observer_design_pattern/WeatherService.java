package com.project.behavioural_design_pattern.observer_design_pattern;

public interface WeatherService {

   void setTemperature(Double temperature);
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void forcastTemperature();
}
