public class Hotel{
	
	private Habitacion[] conjunto;
	private int numHabitaciones;
	
	public Hotel(int tamHotel){
		if (tamHotel < 1)
			tamHotel = 1;
		
		numHabitaciones = 0;
		conjunto = new Habitacion[tamHotel];
	}
	
	public void insertarHabitacion(Habitacion hab){
		if (numHabitaciones < conjunto.length)
			conjunto[numHabitaciones++] = hab;
	}
	
	public String mostrarInfoHabitacion(int numero){
		boolean encontrado = false;
		String cadenaDevuelta = "";
		
		int ind = 0;
		while ((!encontrado) && (ind < numHabitaciones)){
			if (conjunto[ind].getNumero() == numero)
				encontrado = true;
		}
		
		if (!encontrado)
			cadenaDevuelta = "LO SENTIMOS. ESE NUMERO DE HABITACION NO ESTA EN EL HOTEL";
		else
			cadenaDevuelta = conjunto[ind].toString();
		
		return cadenaDevuelta;
	}
	
	public double mostrarM2SuitesNupciales(){
		double m2 = 0.0;
		
		for (int ind = 0; ind < numHabitaciones; ind++){
			if (conjunto[ind] instanceof SuiteNupcial)
				m2 += conjunto[ind].getSuperficie();
		}
		
		return m2;
	}
	
	public String mostrarHabitacionesAseos(){
		String cadenaDevuelta = "";
		
		for (int ind = 0; ind < numHabitaciones; ind++){
			if ((conjunto[ind] instanceof Suite) || (conjunto[ind] instanceof SuiteNupcial)){
				if (((Suite)conjunto[ind]).getNumaseos() > 1)
					cadenaDevuelta += conjunto[ind].toString();
			}
		}
		
		return cadenaDevuelta;
	}
	
	public Hotel union(Hotel otro){
		Hotel nuevo = new Hotel(this.conjunto.length + otro.conjunto.length);
		int indiceNuevo = 0;
		
		for (int ind = 0; ind < this.numHabitaciones; ind++)
			nuevo.conjunto[indiceNuevo++] =  this.conjunto[ind];
		
		for (int ind = 0; ind < otro.numHabitaciones; ind++)
			nuevo.conjunto[indiceNuevo++] = otro.conjunto[ind];
		
		nuevo.numHabitaciones = indiceNuevo;
		return nuevo;
	}
}