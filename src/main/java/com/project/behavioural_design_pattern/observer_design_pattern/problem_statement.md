Problem Statement: Weather Monitoring System

You are building a weather monitoring system.

The system collects weather data like temperature, humidity, and pressure.

There are multiple display devices or modules that need this data:

Current Conditions Display – shows the latest weather.

Statistics Display – shows average, min, max values.

Forecast Display – shows predicted weather trends.

Whenever the weather data changes, all displays should update automatically.

The system should allow adding new display modules easily without changing the weather data source.

Key Points for Observer Pattern

Subject (Observable): WeatherData – keeps track of weather measurements.

Observers: Displays (CurrentConditions, Statistics, Forecast) – register to receive updates.

Decoupling: WeatherData doesn’t need to know the details of each display.

Dynamic: Observers can register or unregister at runtime.

Example Conceptually
WeatherData weatherData = new WeatherData();

CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);

weatherData.setMeasurements(30, 65, 1013); // All observers get notified automatically

✅ Benefits achieved:

Observers automatically update when the subject changes.

You can add/remove new displays without modifying WeatherData.

Promotes loose coupling between subject and observers.