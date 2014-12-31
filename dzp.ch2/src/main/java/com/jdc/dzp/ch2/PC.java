package com.jdc.dzp.ch2;

public class PC extends Computer {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	PC(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

}
