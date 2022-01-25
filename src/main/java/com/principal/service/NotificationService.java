package com.principal.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	///http://localhost:8181/send?mobile=9553326458
	public void sendTextMessage(String mobile) {
		
		sleep(2);
		System.out.println("called 3rd party to send text message:::: "+Thread.currentThread().getName());
	}
	
	private void sleep(int args)
	{
		try {
			TimeUnit.SECONDS.sleep(args);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}
