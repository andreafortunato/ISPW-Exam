package com.ispw.exam.fortunatoandrea.vehicles;

public class Motorcycle implements Vehicle {
	
	private Integer displacement;
	
	public Motorcycle() {
		this(50);
	}
	
	public Motorcycle(Integer displacement) {
		this.displacement = displacement;
	}

	@Override
	public Boolean drivenByNovice() {
		return this.displacement <= 50;
	}
}
