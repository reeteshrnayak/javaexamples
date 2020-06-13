package com.asksiree.example.deadlock;

public class DeadLockSolutionClass {

	public static Object lockObj1 = new Object();
	public static Object lockObj2 = new Object();

	public static void main(String args[]) {
		DeadLockSolutionClass deadLockObj = new DeadLockSolutionClass();
		deadLockObj.t1.start();
		deadLockObj.t2.start();
	}

	Thread t1 = new Thread("Thread One") {
		public void run() {
			synchronized (lockObj1) {
				System.out.println("Thread One: Acquired Lock1");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread One: Waiting for Lock2");

				synchronized (lockObj2) {
					System.out.println("Thread One: Acquired Lock1 & Lock2");
				}
			}
		}
	};

	Thread t2 = new Thread("Thread Two") {
		public void run() {
			synchronized (lockObj1) {
				System.out.println("Thread Two: Acquired Lock1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread Two: Waiting for Lock2");
				synchronized (lockObj2) {
					System.out.println("Thread Two: Acquired Lock1 & Lock2");
				}
			}
		}
	};

}
