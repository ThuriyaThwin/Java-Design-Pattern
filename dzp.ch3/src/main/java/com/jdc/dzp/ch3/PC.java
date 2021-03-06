package com.jdc.dzp.ch3;

public class PC extends Computer {
	
	private String CPU;
	private String RAM;
	private String HDD;

	public PC(String cPU, String rAM, String hDD) {
		super();
		CPU = cPU;
		RAM = rAM;
		HDD = hDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

}
