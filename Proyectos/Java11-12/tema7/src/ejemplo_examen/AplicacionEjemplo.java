package ejemplo_examen;

public class AplicacionEjemplo{
	public static int menu(){
		int opcion = 0;
		do{
			System.out.print("\n\n\n\n\n\n");
			System.out.println(" ----- MENU ------");
			System.out.println("1 - Insertar Profesor");
			System.out.println("2 - Insertar Alumno");
			System.out.println("3 - Numero de personas en el instituto");
			System.out.println("4 - Mostrar toda la información del centro");
			System.out.println("0 - Salir");
			System.out.println("Introduzca una opcion (0-4): ");
			opcion = Leer.datoInt();
		}while ((opcion < 0)&&(opcion>4));
		
		return opcion;
	}

	public static void main(String[] args){
		Profesor profe;
		Alumno alum;
		Instituto centro1 = new Instituto();
		int opcion = 0, edad = 0;
		String nombre = "", matricula = "";
		float sueldo = 0.0f;
		do{
			opcion = menu();
			switch (opcion){
				case 1:{
					System.out.print("Introduzca el nombre del profesor: ");
					nombre = Leer.dato();
					System.out.print("Introduzca la edad del profesor: ");
					edad = Leer.datoInt();
					System.out.print("Introduzca el sueldo del profesor: ");
					sueldo = Leer.datoFloat();
					profe = new Profesor(nombre,edad,sueldo);
					centro1.insertarPersona(profe);
					break;
				}
				case 2:{
					System.out.print("Introduzca el nombre del alumno: ");
					nombre = Leer.dato();
					System.out.print("Introduzca la edad del alumno: ");
					edad = Leer.datoInt();
					System.out.print("Introduzca el codigo de la matricula del alumno: ");
					matricula = Leer.dato();
					alum = new Alumno(nombre,edad,matricula);
					centro1.insertarPersona(alum);
					break;
				}
				case 3:{
					System.out.println("El numero de personas en el centro es " + centro1.numeroPersonas());
					break;
				}
				case 4:{
					System.out.println("INFORMACIÓN COMPLETA DE PERSONAS DEL CENTRO");
					System.out.print(centro1.mostrarPersonas());
					break;
				}
			}
		}while (opcion != 0);
	}
}