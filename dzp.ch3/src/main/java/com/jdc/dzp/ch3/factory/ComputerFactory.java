package com.jdc.dzp.ch3.factory;

import com.jdc.dzp.ch3.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.getComputer();
	}
}
