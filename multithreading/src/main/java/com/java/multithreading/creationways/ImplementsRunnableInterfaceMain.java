package com.java.multithreading.creationways;

public class ImplementsRunnableInterfaceMain {

	public static void main(String[] args) {
		ImplementsRunnableInterface runnabeObj = new ImplementsRunnableInterface();
		Thread t1 = new Thread(runnabeObj); 
		t1.start();

	}

}
