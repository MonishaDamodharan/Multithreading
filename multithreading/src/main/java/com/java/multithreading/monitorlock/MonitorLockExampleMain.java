package com.java.multithreading.monitorlock;

public class MonitorLockExampleMain {

	public static void main(String[] args) throws InterruptedException {
		
		MonitorLockExample obj = new MonitorLockExample();
		
		Thread t1 = new Thread(()->{
			try {
				obj.task1();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		);
		
		Thread t2 = new Thread( ()->{
			obj.task2();} 
		);
		
		Thread t3 = new Thread( ()->{
			obj.task3();} 
		);
		
		// Starting the theads
		t1.start();
		t2.start();
		t3.start();
	}

}
