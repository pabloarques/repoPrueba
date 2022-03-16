public class Cliente {

	private String dni;
	private String nombre;
	private String especialidad;

	public Cliente(String dni, String nombre, String especialidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.especialidad = especialidad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
