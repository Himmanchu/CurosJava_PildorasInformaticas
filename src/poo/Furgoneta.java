package poo;

public class Furgoneta extends Coche {   //HERENCIA de la clase coche. extends + nombre de clase

	private int capacidad_carga;
	
	private int plazas_extra;
	
	
public Furgoneta(int plazas_extra, int capacidad_carga) {  //método constructor
	
	super();    //llamar al constructor de la clase padre
	
	this.capacidad_carga=capacidad_carga;
	
	this.plazas_extra=plazas_extra;
	
	
}

	
}
