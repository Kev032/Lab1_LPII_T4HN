package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Empleado;

public class EmpleadoController {
	
	// Crear Empleado
	public String createEmpleado(String apellido, String nombre, int edad, String sexo, int salario  ) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			Empleado empleado;
			empleado = new Empleado(apellido, nombre, edad, sexo, salario);
			
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado creado correctamente";
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "Error al crear el empleado";
	}
	
	// Eliminar Empleado
	public String deleteEmpleado(int idEmpleado) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Empleado eliminado exitosamente";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al elimnar al Empleado";
	}
	
	// Actualizar Empleado
	public String updateEmpleado(int idEmpleado, String apellidos, String nombres, int edad, String sexo, int salario) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			
			if (empleado != null) {

	            empleado.setApellidos(apellidos);
	            empleado.setNombres(nombres);
	            empleado.setEdad(edad);
	            empleado.setSexo(sexo);
	            empleado.setSalario(salario);


	            session.update(empleado);
	            session.getTransaction().commit();

	            sessionFactory.close();

	            return "Empleado actualizado correctamente";
	        } else {
	            return "Empleado no encontrado";
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error al actualizar el empleado";	
	}
	
	// Obtener Empleado
	public String getEmpleado(int idEmpleado) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado = session.get(Empleado.class, idEmpleado);
			session.getTransaction().commit();
			sessionFactory.close();
			
			return empleado.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "El empleado no existe";
	}
	
}
