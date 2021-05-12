package com.qa.javaBeginner.abstraction;

public abstract class Spec extends InitialSpec{
	// abstract classes can inherit from other abstract classes
	// abstract classes can have abstract and non-abstract methods 
	
	//abstract methods
	abstract void create();
	
	abstract void read();
	
	
	//non-abstract methods
	public String helloWorld() {
		return "Hello world";
	}

}
