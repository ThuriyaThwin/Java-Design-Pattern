package com.jdc.dzp.ch1.ep4;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton INSTANCE;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new ThreadSafeSingleton();
		}
		return INSTANCE;
	}
}
