package com.qa.javaIntermediate;

public enum Menu {

	STARTER(1), MAIN(2), DESSERT(3);

	private final int option;

	Menu(int i) {
		this.option = i;
	}

	public int print() {
		return option;	
	}
	
}
