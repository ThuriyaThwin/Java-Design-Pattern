package com.jdc.dzp.ch4;

public class Computer {
	
	private String RAM;
	private String HDD;
	
	private boolean isGraphicEnabled;
	private boolean isBlueToothEnabled;
	
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public boolean isGraphicEnabled() {
		return isGraphicEnabled;
	}
	public boolean isBlueToothEnabled() {
		return isBlueToothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.isGraphicEnabled = builder.isGraphicEnabled;
		this.isBlueToothEnabled = builder.isBlueToothEnabled;
	}
	
	public static class ComputerBuilder {
		private String RAM;
		private String HDD;
		
		private boolean isGraphicEnabled;
		private boolean isBlueToothEnabled;
		
		public ComputerBuilder(String rAM, String hDD) {
			super();
			RAM = rAM;
			HDD = hDD;
		}
		
		public ComputerBuilder setGraphicEnabled(boolean graphic) {
			this.isGraphicEnabled = graphic;
			return this;
		}
		
		public ComputerBuilder setBlueToothEnabled(boolean blueTooth) {
			this.isBlueToothEnabled = blueTooth;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
	@Override
	public String toString() {
		return String.format("RAM : %s, HDD : %s, BLUETOOTH : %b, GRAPHIC : %b", RAM, HDD, isBlueToothEnabled, isGraphicEnabled);
	}

}
