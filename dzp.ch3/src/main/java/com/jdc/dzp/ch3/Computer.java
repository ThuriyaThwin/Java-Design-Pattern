package com.jdc.dzp.ch3;

public abstract class Computer {
	public abstract String getCPU();
	public abstract String getRAM();
	public abstract String getHDD();
	
	@Override
	public String toString() {
		return String.format("RAM : %s, HDD : %s, CPU : %s", getRAM(),
				getHDD(), getCPU());
	}
}
