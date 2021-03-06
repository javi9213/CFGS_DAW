public class Suite extends Habitacion{
	
	private int numaseos;
	private boolean jacuzzi;
	
	public Suite(int num, double sup, int ncam, double prem2, int numase, boolean jacu){
		super(num,sup,ncam,prem2,true);
		this.setNumaseos(numase);
		this.setJacuzzi(jacu);
	}

	public int getNumaseos(){
		return numaseos;
	}

	public void setNumaseos(int numaseos){
		this.numaseos = numaseos;
	}

	public boolean isJacuzzi(){
		return jacuzzi;
	}

	public void setJacuzzi(boolean jacuzzi){
		this.jacuzzi = jacuzzi;
	}
	
	@Override
	public void setVistasexteriores(boolean vistasexteriores){

	}
	
	@Override
	public String toString(){
		String cadena = super.toString();
		
		cadena += "\nNumero de aseos: " + this.getNumaseos()
				+ (isJacuzzi()?"\nTiene Jacuzzi":"\nNo tiene Jacuzzi");
		
		return cadena;
	}
}