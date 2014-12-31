package com.jdc.dzp.ch1.ep3;

public class LazyInstanciateSingleton {
	
	private LazyInstanciateSingleton() {}
	
	private static LazyInstanciateSingleton INSTANCE;
	
	public static LazyInstanciateSingleton getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new LazyInstanciateSingleton();
		}
		return INSTANCE;
	}

}
