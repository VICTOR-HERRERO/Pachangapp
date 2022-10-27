package dominioConHerencia;

public abstract class Carta {
	
	String nombre; //será como el id de la carta, ya que no se repetira
	int puntos; //puntos de valor de cada jugador, utilizado en el apartado de alineación
	int coste; //coste de cada jugador
	
	

	public Carta(String nombre, int puntos, int coste) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
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

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}
	
	
	
	

}
