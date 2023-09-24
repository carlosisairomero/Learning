package com.cromero._02_observer._01_simple;
	
public class SimpleObserver implements Observer {
	private int value;
	private Subject simpleSubject;
	
	public SimpleObserver(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
		simpleSubject.registerObserver(this);
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.println("Value: " + value);
	}
}
