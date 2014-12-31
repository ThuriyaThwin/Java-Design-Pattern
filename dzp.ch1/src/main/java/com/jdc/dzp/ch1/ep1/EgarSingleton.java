package com.jdc.dzp.ch1.ep1;

public class EgarSingleton {
	
	private static EgarSingleton INSTANCE = new EgarSingleton();
	
	private EgarSingleton() {}

	public static EgarSingleton getInstance() {
		return INSTANCE;
	}
}
