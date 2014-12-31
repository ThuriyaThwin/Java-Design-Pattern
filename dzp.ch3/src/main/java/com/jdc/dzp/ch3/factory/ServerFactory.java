package com.jdc.dzp.ch3.factory;

import com.jdc.dzp.ch3.Computer;
import com.jdc.dzp.ch3.Servere;

public class ServerFactory implements ComputerAbstractFactory {

	private Servere computer;
	
	public ServerFactory(String cpu, String ram, String hdd) {
		computer = new Servere(cpu, ram, hdd);
	}
	public Computer getComputer() {
		return computer;
	}

}
