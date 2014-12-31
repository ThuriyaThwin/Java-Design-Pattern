package com.jdc.dzp.ch5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> employees;

	public Employees() {
		employees = new ArrayList<String>();
	}

	public Employees(List<String> employees) {
		super();
		this.employees = employees;
	}

	public List<String> getEmployees() {
		return employees;
	}

	public void loadData() {
		employees.addAll(Arrays.asList("Mg Mg", "Ag Ag", "Myo Myo", "Thidar"));
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<String>(employees);
		return new Employees(tmp);
	}
}
