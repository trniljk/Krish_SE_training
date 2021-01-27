package com.ishara.designpatterns.chainofResponsibility;

import java.util.Set;

public class PlatinumMember extends Handler {

	@Override
	public Set setLoyaltyBenifits(Receipt receipt) {
		receipt.setReward("Get 10% Discount for Next Bill");
		System.out.println("Platinum Member Reward added");
		
		return receipt.getReward();
		
	}
	
}
