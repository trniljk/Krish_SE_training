package com.ishara.designpatterns.chainofResponsibility;

import java.util.Set;

public class SilverMember extends Handler{

	@Override
	public Set setLoyaltyBenifits(Receipt receipt) {

		receipt.setReward("1000 Reward Points");
		System.out.println("Silver Member Reward added");
		if(getLoyaltytype(receipt.getLoyaltyCardNumber())==LoyaltyType.SILVER) {
			return receipt.getReward();
		}else {
			return successor.setLoyaltyBenifits(receipt);
		}		
	}
	

	
	
}
