package practica;

public class GeneradorRock extends GeneradorMusica {
	// Instrumento que suena en la cancion de Rock el cual es string
    private String instrumento;
    //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica
    
	// Tipo del genero de canciones de rock o sus variantes

    private String tipoRock; 
	public GeneradorRock(String genero, String letra,String inst,String tipoRock) {
		super(genero, letra);
	}


	public void generarCancion() {
		
	}


	public void reproducirMusica() {
		
	}
	public void generarLetraRock(){
		
		
	}
	public void instrumentos() {
		
		
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}


	public String getTipoRock() {
		return tipoRock;
	}


	public void setTipoRock(String tipoRock) {
		this.tipoRock = tipoRock;
	}
	
	

}
