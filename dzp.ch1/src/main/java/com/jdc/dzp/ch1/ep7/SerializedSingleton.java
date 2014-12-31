package com.jdc.dzp.ch1.ep7;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static SerializedSingleton INSTANCE;
	
	private SerializedSingleton() {}

	public static SerializedSingleton getInstance() {
		if(null == INSTANCE)
			INSTANCE = new SerializedSingleton();
		
		return INSTANCE;
	}
}
