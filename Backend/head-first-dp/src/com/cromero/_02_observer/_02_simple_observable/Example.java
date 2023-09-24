package com.cromero._02_observer._02_simple_observable;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
	}
}
