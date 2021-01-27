package com.ishara.designpatterns.chainofResponsibility;

import java.util.Set;

public class GoldMember extends Handler{

	@Override
	public Set setLoyaltyBenifits(Receipt receipt) {
		receipt.setReward("Get 10% Discount for SPA Next Bill");
		System.out.println("Gold Member Reward added");
		if(getLoyaltytype(receipt.getLoyaltyCardNumber())==LoyaltyType.GOLD) {
			return receipt.getReward();
		}else {
			return successor.setLoyaltyBenifits(receipt);
		}	
	}

	
	

}
