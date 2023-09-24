package com.cromero._02_observer._04_weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
