package com.ispw.exam.andreafortunto.factorymethod;

import java.security.InvalidParameterException;

import com.ispw.exam.andreafortunto.factorymethod.vehicles.Vehicle;
import com.ispw.exam.andreafortunto.factorymethod.vehicles.VehicleType;

public class Client {
	
	private Vehicle vehicle1;
	private Vehicle vehicle2;
	private Vehicle vehicle3;
	private Vehicle vehicle4;
	
	public Client() {
		Factory factory = new Factory();

		try {
			this.vehicle1 = factory.createVehicle(VehicleType.PANDA);
			this.vehicle2 = factory.createVehicle(VehicleType.FERRARI);
			this.vehicle3 = factory.createVehicle(VehicleType.LIBERTY);
			this.vehicle4 = factory.createVehicle(VehicleType.PANIGALE);
		}	
		catch (InvalidParameterException ipe) {
			System.exit(-1);
		}
	}

	public static void main (String[] args){
		Client client = new Client();
		
		client.vehicle1.drivenByNovice();
		client.vehicle2.drivenByNovice();
		client.vehicle3.drivenByNovice();
		client.vehicle4.drivenByNovice();
	}
	
}
