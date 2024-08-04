package com.springTransctional.config;

import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
@Component
public class UserProgramaticApproch1 {

	PlatformTransactionManager platformTransactionManager;
	
	UserProgramaticApproch1(PlatformTransactionManager platformTransactionManager){
		this.platformTransactionManager=platformTransactionManager;
	}
	
	public void updateUserProgramatic() {
		TransactionStatus transaction1 =platformTransactionManager.getTransaction(null);
		
		try {
			
			platformTransactionManager.commit(transaction1);
		} catch (Exception e) {
			platformTransactionManager.rollback(transaction1);
			// TODO: handle exception
		}
		
	}
}
