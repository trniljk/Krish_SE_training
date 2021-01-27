package com.ishara.designpatterns.chainofResponsibility;

import java.util.Set;

public class LoyaltyMember extends Handler{

	@Override
	public Set setLoyaltyBenifits(Receipt receipt) {
		
		return successor.setLoyaltyBenifits(receipt);
	}
	

}
