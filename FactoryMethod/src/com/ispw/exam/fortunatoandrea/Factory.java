package com.ispw.exam.fortunatoandrea;

import java.security.InvalidParameterException;

import com.ispw.exam.fortunatoandrea.vehicles.Car;
import com.ispw.exam.fortunatoandrea.vehicles.Motorcycle;
import com.ispw.exam.fortunatoandrea.vehicles.Vehicle;
import com.ispw.exam.fortunatoandrea.vehicles.VehicleType;

public class Factory {
	
	public Vehicle createVehicle(VehicleType type) throws InvalidParameterException {
		if(type == VehicleType.PANDA)
			return new Car(70);
		else if (type == VehicleType.FERRARI)
			return new Car(270);
		else if (type == VehicleType.LIBERTY)
			return new Motorcycle(50);
		else if (type == VehicleType.PANIGALE)
			return new Motorcycle(1200);
		else
			throw new InvalidParameterException("Invalid vehicle type: " + type);
        }
	
	public Vehicle createPandaVehicle() {
		return new Car(70);
	}
	
	public Vehicle createFerrariVehicle() {
		return new Car(270);
	}
	
	public Vehicle createLibertyVehicle() {
		return new Motorcycle(50);
	}
	
	public Vehicle createPanigaleVehicle() {
		return new Motorcycle(1200);
	}
	
}
