package ficheros;

public class Preguntas {

	private int id;
	private String pregunta;
	private String respuestaA;
	private String respuestaB;
	private String respuestaC;
	private String respuestaD;
	private String respuestaCorrecta;
	
	public Preguntas () {
		
	}
	
	public Preguntas (int id, String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String respuestaCorrecta) {
		this.id = id;
		this.pregunta = pregunta;
		this.respuestaA = respuesta1;
		this.respuestaB = respuesta2;
		this.respuestaC = respuesta3;
		this.respuestaD = respuesta4;
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuestaA() {
		return respuestaA;
	}

	public void setRespuestaA(String respuestaA) {
		this.respuestaA = respuestaA;
	}

	public String getRespuestaB() {
		return respuestaB;
	}

	public void setRespuestaB(String respuestaB) {
		this.respuestaB = respuestaB;
	}

	public String getRespuestaC() {
		return respuestaC;
	}

	public void setRespuestaC(String respuestaC) {
		this.respuestaC = respuestaC;
	}

	public String getRespuestaD() {
		return respuestaD;
	}

	public void setRespuestaD(String respuestaD) {
		this.respuestaD = respuestaD;
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	
	public String toString() {
		
		return getPregunta() + "/n" + getRespuestaA() + "/n" + getRespuestaB() + "/n" + getRespuestaC()  + "/n" + getRespuestaD() +
				"/ncuyo ide es: " + getId() + " y su respuesta correcta es la respuesta " + getRespuestaCorrecta();
		
	}
	
	
}
