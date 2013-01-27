package lista_circular;

@SuppressWarnings("rawtypes")
public class colas<T>{

	listac<T> cola;
	
	@SuppressWarnings("unchecked")
	public colas(){
		cola = new listac();
	}
	
	public int size(){
		return cola.tamanio();
	}
	
	public void push(T obj){				//a�adir
		cola.addLast(obj);
	}
	
	public T pop(){							//obtener
		return cola.borrar();
	}
	
	public boolean colaVacia(){
		return (cola.tamanio() == 0);
	}
	
	public boolean colaLlena(){
		return false;
	}
}