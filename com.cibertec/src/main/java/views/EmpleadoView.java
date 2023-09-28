package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		//crear
		/*String empleado1 = new EmpleadoController().createEmpleado("Giraldo", "Carlos", 20, "Masculino", 5000.00); 
		String empleado2 = new EmpleadoController().createEmpleado("Arellano", "Ronald", 27, "Masculino", 1800.00); 
		String empleado3 = new EmpleadoController().createEmpleado("Araujo", "Catalina", 22, "Femenino", 2500.00); 
		String empleado4 = new EmpleadoController().createEmpleado("Vega", "Diego", 23, "Masculino", 7000.00); 
		String empleado5 = new EmpleadoController().createEmpleado("Ponce", "Arnold", 19, "Masculino", 900.00);
		String empleado6 = new EmpleadoController().createEmpleado("Jara", "Carla", 21, "Femenino", 900.00);
		
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		System.out.println(empleado6);
		*/
		
		//eliminar
		/*String empleado = new EmpleadoController().deleteEmpleado(5);
		System.out.println(empleado);*/

		
		//actualizar
		/*String empleado = new EmpleadoController().updateEmpleado(2, "Arellano Quispe", "Ronald Jesus", 28, "Masculino", 3500.00);
		System.out.println(empleado);*/
		
		//leer
		String empleado = new EmpleadoController().getEmpleado(6);
		System.out.println(empleado);

	}

}
