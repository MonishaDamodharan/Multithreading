package com.java.multithreading.monitorlock;

public class MonitorLockExample {
	
	public synchronized void task1() throws InterruptedException {
		System.out.println("I am in task1");
		Thread.sleep(10000);
		System.out.println("task1 got completed");
	}
	
	public void task2() {
		System.out.println("task2 before synchronized block");
		synchronized(this) {
			System.out.println("task2 in synchronized block");
		}
	}
	
	public void task3() {
		System.out.println("task3 got completed");
	}


}
