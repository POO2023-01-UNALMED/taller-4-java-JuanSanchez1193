package classroom;

public enum Tipo {
	DISCIPLINAR(10, ""),FUNDAMENTACION(20, ""),ELECTIVA(30, "");
	
	private int codigo;
	private  String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	private Tipo(String nombre, int codigo) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	//getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
