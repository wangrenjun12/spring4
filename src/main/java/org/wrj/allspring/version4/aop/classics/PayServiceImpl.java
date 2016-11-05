package org.wrj.allspring.version4.aop.classics;

import org.springframework.stereotype.Service;

@Service("payService")
public class PayServiceImpl implements PayService {

	public boolean payOrder(String bankAccountId, String orderId) {
		System.out.println(String.format("paying orderId=%s bankAccountId =%s",
				orderId, bankAccountId));

		boolean isPaySuccess = true;
		return isPaySuccess;
	}

}
