package com.ishara.designpatterns.chainofResponsibility;

import java.util.Set;

public abstract class Handler {
	
	
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	protected LoyaltyType getLoyaltytype(Long loyaltyCardNumber) {
		LoyaltyType loyaltyType;
		int firstDigits = Integer.valueOf(loyaltyCardNumber.toString().substring(0, 1));
		switch(firstDigits) {
		  case (5):
		    loyaltyType = LoyaltyType.PLATINUM;
		    break;
		  case (4):
			  loyaltyType = LoyaltyType.GOLD;
			  break;
		  case (3):
			  loyaltyType = LoyaltyType.SILVER;
			  break;
		  default:
			  loyaltyType = null;		    	
		}
		return loyaltyType;
	}
	
	public abstract Set setLoyaltyBenifits(Receipt receipt);

}
