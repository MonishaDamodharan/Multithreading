package com.java.multithreading.inter_thread_communication;

public class JoinMessageBoxMain {

	public static void main(String[] args) throws InterruptedException {
		
		JoinMessageBox obj = new JoinMessageBox();
		
		Thread t1 = new Thread(()->{
			try {
				obj.producer("Hello from producer");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(()->{
			String message = null;
			try {
				message = obj.consumer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Message from consumer : "+message);
		});
		
		t1.start();
		t2.start();

	}

}
