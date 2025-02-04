package com.siva.oops.interface_examples;

public class Interface_Example3 {

	public static void main(String[] args) {
		Sim sim;
		// sim = new JioSim();
		sim = new AirtelSim();// Up-Casting.
		Mobile.setSim(sim);

	}

}

class Mobile {
	public static void setSim(Sim sim) {
		sim.call();
	}
}

interface Sim {
	public void call();
}

class JioSim implements Sim {

	@Override
	public void call() {
		System.out.println("Jio calling");

	}

}

class AirtelSim implements Sim {

	@Override
	public void call() {
		System.out.println("Airtel calling");

	}

}
