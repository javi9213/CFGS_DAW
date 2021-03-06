package listas_simplemente_enlazadas;

public class AppLista {

	public static void mostrarlista(lista<Cdatos> lista){
		int i=0, tam=lista.getTamanio();
	  
		while(i<tam){
			System.out.println(lista.obtener(i).getNombre()+" --- "+lista.obtener(i).getNota());
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		lista<Cdatos> listdat = new lista<Cdatos>();
		Cdatos d1 = new Cdatos("jose", 5.2);
		Cdatos d2 = new Cdatos("pedro", 7.65);
		Cdatos d3 = new Cdatos("antonio", 9.5);
		
		listdat.anadirPrincipio(d1);
		listdat.anadirPrincipio(d2);
		listdat.anadirFinal(d3);
		
		mostrarlista(listdat);
		System.out.println();
		
		System.out.println("Borrar "+listdat.Borrar(1));
		
		mostrarlista(listdat);
		System.out.println();
		
		System.out.println("Obtener "+listdat.obtener(2));
		
		mostrarlista(listdat);
	}
	
}