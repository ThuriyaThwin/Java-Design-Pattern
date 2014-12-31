package com.jdc.dzp.ch2;

public abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return String.format("RAM : %s, HDD : %s, CPU : %s", getRAM(),
				getHDD(), getCPU());
	}
	
	public enum TYPE {PC, SERVER}
}
