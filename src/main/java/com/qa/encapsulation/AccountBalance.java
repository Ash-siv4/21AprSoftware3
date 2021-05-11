package com.qa.encapsulation;

public class AccountBalance {

	// read-only

	// attributes
	private int amount;
	private String history;

	// getters only
	public int getAmount() {
		return amount;
	}

	public String getHistory() {
		return history;
	}

}
