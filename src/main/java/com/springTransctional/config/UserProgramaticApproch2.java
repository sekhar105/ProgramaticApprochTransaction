package com.springTransctional.config;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
@Component
public class UserProgramaticApproch2 {

	
	TransactionTemplate transactionTemplate;
	
	public UserProgramaticApproch2(TransactionTemplate transactionTemplate) {
		this.transactionTemplate=transactionTemplate;
	}
	
	
	public void updateUserProgramatic() {
		TransactionCallback<TransactionStatus> dbOperationtask=(TransactionStatus status)->{
			System.out.println("run insert query");
			System.out.println("run update query");
			return status;
		};
		TransactionStatus status=transactionTemplate.execute(dbOperationtask);
	}
}
