package com.jdc.dzp.ch1.ep2;


public class StaticBlockSingleton {
	
	public static StaticBlockSingleton INSTANCE;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			INSTANCE = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Error on instanciation Singleton");
		}
	}
	
	public StaticBlockSingleton getInstance() {
		return INSTANCE;
	}

}
