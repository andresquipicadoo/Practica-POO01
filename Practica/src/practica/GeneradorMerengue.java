package practica;

public class GeneradorMerengue extends GeneradorMusica {
	// Tipo del genero de canciones de merengue o sus variantes
	private String tipoMerengue;
	// Instrumento que suena en la cancion de Merengue el cual es string
    private String instrumento;
    //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica
	public GeneradorMerengue(String genero, String letra,String inst) {
		super(genero, letra);
	}

	
	public void generarCancion() {
		
	}

	public void reproducirMusica() {
		
	}
	
	public void instrumento() {
		
	}
    public void generarLetraMerengue() {
		
		
		
	}


	public String getTipoMerengue() {
		return tipoMerengue;
	}


	public void setTipoMerengue(String tipoMerengue) {
		this.tipoMerengue = tipoMerengue;
	}


	public String getInstrumento() {
		return instrumento;
	}


	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}


}
