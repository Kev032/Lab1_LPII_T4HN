package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	
	@Id
	@Column(name = "idEmpleado")
	private int idEmpleado;
	
	@Column(name = "Apellidos")
	private String apellidos;
	
	@Column(name = "Nombres")
	private String nombres;
	
	@Column(name = "Edad")
	private int edad;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name = "Salario")
	private int salario;
	
	
	public Empleado() {
	}

	public Empleado(String apellidos, String nombres, int edad, String sexo, int salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}
	
	public int getIdEmplado() {
		return idEmpleado;
	}
	
	public void setIdEmplado(int idEmplado) {
		this.idEmpleado = idEmplado;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Empleado [idEmplado=" + idEmpleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	

}
