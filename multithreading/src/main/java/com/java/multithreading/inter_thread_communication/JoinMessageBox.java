package com.java.multithreading.inter_thread_communication;

public class JoinMessageBox extends Thread{
	
	public String message;
	public boolean hasMessage = false;
	
	public synchronized void producer(String value) throws InterruptedException {
		
		while(hasMessage) {
			wait();
		}
		
		message = value;
		System.out.println("Produced message : "+value);
		hasMessage=true;
	}
	
	public synchronized String consumer() throws InterruptedException{
		
		while(!hasMessage) {
			wait();
		}
		
		System.out.println("Consumed message : "+message);
		hasMessage=false;
		return message;
		
	}
	
	

}
