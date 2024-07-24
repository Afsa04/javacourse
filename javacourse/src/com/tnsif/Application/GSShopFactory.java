package com.tnsif.Application;

import com.tnsif.Framework.NormalAcc;
import com.tnsif.Framework.PrimeAcc;
import com.tnsif.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

		@Override
		public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
			PrimeAcc primeacc=new GSPrime(accNo,accNm,charges,isPrime);
			return primeacc;
		}

		@Override
		public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges) {
			NormalAcc normalacc=new GSNormal(accNo,accNm,charges,deliverycharges);
			return normalacc;
		}


}
