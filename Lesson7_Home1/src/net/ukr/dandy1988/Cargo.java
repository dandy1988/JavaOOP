package net.ukr.dandy1988;

public class Cargo {

private int cargo;


public Cargo() {
	super();
	// TODO Auto-generated constructor stub
}

public Cargo(int cargo) {
	this.cargo = cargo;
}

public int getCargo() {
	return cargo;
}

public void setCargo(int cargo) {
	this.cargo = cargo;
}

public synchronized void decCargo() {
	if (this.cargo>0) {
		this.cargo--;
	}
	
}

}
