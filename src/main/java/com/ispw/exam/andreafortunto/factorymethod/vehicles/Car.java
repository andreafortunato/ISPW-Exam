package com.ispw.exam.andreafortunto.factorymethod.vehicles;

public class Car implements Vehicle {
	
	private Integer horsepower;
	
	public Car() {
		this(50);
	}
	
	public Car(Integer horsepower) {
		this.horsepower = horsepower;
	}

	@Override
	public Boolean drivenByNovice() {
		return this.horsepower <= 95;
	}

}
