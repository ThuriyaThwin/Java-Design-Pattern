package com.jdc.dzp.ch3.factory;

import com.jdc.dzp.ch3.Computer;
import com.jdc.dzp.ch3.PC;

public class PcFactory implements ComputerAbstractFactory {
	
	private PC pc;
	
	public PcFactory(String cpu, String ram, String hdd) {
		pc = new PC(cpu, ram, hdd);
	}

	public Computer getComputer() {
		return pc;
	}

}
