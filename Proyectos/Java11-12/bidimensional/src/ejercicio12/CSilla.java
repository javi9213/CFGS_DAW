package ejercicio12;

public class CSilla {

	private int [][]array;
	private final int TAMARRAY = 10;
	
	public CSilla(){
		array = new int[TAMARRAY][TAMARRAY];
	}

	public int getTAMATRIZ() {
		return TAMARRAY;
	}
	
	public void rellenar(int num){
		for(int i=0;i<=TAMARRAY;i++){
			for (int j=0;j<TAMARRAY;j++) {
				array[i][j] = num;
			}
		}	
	}
	
	public void mostrar(){
		for (int i=0;i<TAMARRAY;i++) {
			for (int j=0;j<TAMARRAY;j++) {
				System.out.print(array[i][j]+" ");
			}
		}
	}
}