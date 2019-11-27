package It7.Dominio;

public class Gestor {

	private string id;
	private string contraseña;

	public string getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(string id) {
		this.id = id;
	}

	public string getContraseña() {
		return this.contraseña;
	}

	/**
	 * 
	 * @param contraseña
	 */
	public void setContraseña(string contraseña) {
		this.contraseña = contraseña;
	}

}