package com.jdc.dzp.ch2;

import com.jdc.dzp.ch2.Computer.TYPE;

public class ComputerFactory {

	public static Computer getComputer(TYPE type, String RAM, String HDD,
			String CPU) {
		Computer computer = null;
		
		switch (type) {
		case PC:
			computer = new PC(RAM, HDD, CPU);
			break;
		case SERVER:
			computer = new Server(RAM, HDD, CPU);
			break;
		default:
			break;
		}

		return computer;
	}

}
