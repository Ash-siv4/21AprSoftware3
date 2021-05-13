package com.qa.javaIntermediate;

public class Generics<T, S> {

	T val;
	T num;
	S name;

	public Generics(T val, T num, S name) {
		super();
		this.val = val;
		this.num = num;
		this.name = name;
	}

	public S method(S a) {
		return a;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	public S getName() {
		return name;
	}

	public void setName(S name) {
		this.name = name;
	}

}
