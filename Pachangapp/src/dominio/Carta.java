package dominio;

public class Carta {
	
	String nombre; //será como el id de la carta, ya que no se repetira
	int puntos; //puntos de valor de cada jugador, utilizado en el apartado de alineación
	boolean categoria; //rol del jugador 0 portero, 1 jugador
	int coste; //coste de cada jugador
	
	

	public Carta(String nombre, int puntos, boolean categoria, int coste) {
		super();
		this.nombre = nombre; //nombre
		this.puntos = puntos;
		this.categoria = categoria;
		this.coste = coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public boolean isCategoria() {
		return categoria;
	}

	public void setCategoria(boolean categoria) {
		this.categoria = categoria;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}
	
	
	
	

}
