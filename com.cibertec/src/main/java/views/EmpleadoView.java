package views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		String empleado;
		
		// Crear Empleado
		//empleado = new EmpleadoController().createEmpleado("Gonzalez", "Jaime", 25, "Masculino", 1500);
		//empleado = new EmpleadoController().createEmpleado("Jaramillo", "Angelica", 25, "Femenino", 1800);
		//empleado = new EmpleadoController().createEmpleado("Morales", "Jason", 25, "Masculino", 2100);
		
		
		//Eliminar Empleado
		//empleado = new EmpleadoController().deleteEmpleado(5);

		
	
		// Actualizar Empleado
		//empleado = new EmpleadoController().updateEmpleado(7, "Carlos", "Montesinos", 45, "Masculino", 3200);
		
		
		// Obtener Empleado
		empleado = new EmpleadoController().getEmpleado(6);
		
		System.out.print(empleado);
	}

}