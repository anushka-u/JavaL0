package com.in.lambdaexpression;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable myThread = ()->{
			Thread.currentThread().setName("my Thread");
			System.out.println(Thread.currentThread().getName() + " is running");
		};
		
		Thread thread = new Thread(myThread);
		thread.start();
	}

}
