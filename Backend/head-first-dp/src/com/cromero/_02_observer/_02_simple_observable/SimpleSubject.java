package com.cromero._02_observer._02_simple_observable;

import java.util.Observable;

public class SimpleSubject extends Observable {
	private int value = 0;
	
	public SimpleSubject() { }
	
	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers(value);
	}
	
	public int getValue() {
		return this.value;
	}
}