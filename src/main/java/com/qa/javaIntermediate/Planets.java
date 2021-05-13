package com.qa.javaIntermediate;

public enum Planets {

	MERCURY(100, 1), VENUS(200, 2), EARTH(300, 1), MARS(400, 2), JUPITER(500, 60), SATURN(600, 70), URANUS(700, 80),
	NEPTUNE(800, 90);

	private final int size;
	private final int gravity;

	private Planets(int size, int gravity) {
		this.size = size;
		this.gravity = gravity;
	}

	public int calc() {
		return size * gravity;
	}

}
