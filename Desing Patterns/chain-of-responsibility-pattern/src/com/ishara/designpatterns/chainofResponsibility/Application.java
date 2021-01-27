package com.ishara.designpatterns.chainofResponsibility;

public class Application {

	public static void main(String[] args) {
		
		LoyaltyMember loyalty = new LoyaltyMember();
		SilverMember silver = new SilverMember();
		GoldMember gold = new GoldMember();
		PlatinumMember platinum = new PlatinumMember();
		
		loyalty.setSuccessor(silver);
		silver.setSuccessor(gold);
		gold.setSuccessor(platinum);
		
		Receipt receipt1 = new Receipt(1,321456987);
		System.out.println(loyalty.setLoyaltyBenifits(receipt1).toString());
		
		Receipt receipt2 = new Receipt(2,53457537);
		System.out.println(loyalty.setLoyaltyBenifits(receipt2).toString());
		
		Receipt receipt3 = new Receipt(3,478966987);
		System.out.println(loyalty.setLoyaltyBenifits(receipt3).toString());
		
	}

}
