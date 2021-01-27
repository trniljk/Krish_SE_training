package com.ishara.designpatterns.chainofResponsibility;


import java.util.HashSet;
import java.util.Set;

public class Receipt {
	private int receiptNumber;
	private long loyaltyCardNumber; 
	
	private Set<String> rewards =new  HashSet<String>();
	
	public Receipt(int receiptNumber,long loyaltyCardNumber) {
		this.receiptNumber = receiptNumber;
		this.loyaltyCardNumber = loyaltyCardNumber;
		
	}
	
	
	protected void setReward(String reward){
		this.rewards.add(reward);
	}
	
	public Set getReward () { return rewards;}
	
	public int getReceiptNumber() {
		return receiptNumber;
	}

	public long getLoyaltyCardNumber() {
		return loyaltyCardNumber;
	}

}
