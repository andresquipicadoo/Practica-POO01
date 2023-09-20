package practica;

public class MezclarGenerosMusicales extends GeneradorMusica {
	//Instrumento usado en las canciones mezcladas
   private String instrumentos;
   //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica

	public MezclarGenerosMusicales(String genero, String letra) {
		super(genero, letra);
	}

	
	public void generarCancion() {
		
	}


	public void reproducirMusica() {
		
	}
	public void  letraMzclada() {
		
	}

 
	public String getInstrumentos() {
		return instrumentos;
	}


	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}
	

}
