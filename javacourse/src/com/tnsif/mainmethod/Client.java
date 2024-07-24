package com.tnsif.mainmethod;

import com.tnsif.Application.GSNormal;
import com.tnsif.Application.GSPrime;
import com.tnsif.Application.GSShopFactory;

public class Client {
	public static void main(String[] args) {
		GSShopFactory obj=new GSShopFactory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getNewPrimeAccount(12, "java", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getNewNormalAccount(13, "spring", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}
}



