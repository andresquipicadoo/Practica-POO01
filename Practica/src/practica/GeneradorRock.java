package practica;

public class GeneradorRock extends GeneradorMusica {
	// Instrumento que suena en la cancion de Rock el cual es string
    private String instrumento;
    //Hereda de GeneradorMusica GenerarCancion y ReproducirMusica
	public GeneradorRock(String genero, String letra) {
		super(genero, letra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generarCancion() {
		
	}

	@Override
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
	
	

}
