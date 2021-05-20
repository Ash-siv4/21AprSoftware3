package com.qa.intermediate2;

public class Math_operation implements Operation{

	Math add = (int a, int b) -> a+b;
	Math sub = (int a, int b) -> a-b;
	Math div = (int a, int b) -> a/b;
	Math mul = (int a, int b) -> a*b;
	Math cubePlus = (int a, int b) -> (a*a*a)+(b*b*b);

	
	public int operate(int a, int b, Math mathOp) {
		return mathOp.math(a, b);
		
	}
	
}
