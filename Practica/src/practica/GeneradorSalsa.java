package practica;

public  class GeneradorSalsa extends GeneradorMusica{
	// Tipo del genero de canciones de salsa como por ejemplo la salsa cubana 
	private String TipoSalsa;
	// Instrumento que suena en la cancion de Salsael cual es string
	private String instrumentos;
    //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica

	public GeneradorSalsa(String genero, String letra, String tipoSalsa, String Instrumentos) {
		super(genero, letra);
	}

	
	public void generarCancion() {
		
		
	}

	
	public void reproducirMusica() {
		
		
	}
	public void generarLetraSalsa() {
		
		
		
	}

	public String getTipoSalsa() {
		return TipoSalsa;
	}

	public void setTipoSalsa(String tipoSalsa) {
		TipoSalsa = tipoSalsa;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}

}
