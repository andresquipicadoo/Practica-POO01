package practica;

public class GenerarReggaeton  extends GeneradorMusica{
	// Tipo del genero de canciones de reggeton 
	private String TipoReg;
	// Instrumento que suena en la cancion reggeton cual es string
	private String instrumentos;
    //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica
	public GenerarReggaeton(String genero, String letra,String Reg,String ins) {
		super(genero, letra);
		
	}

	@Override
	public void generarCancion() {
	
		
	}


	public void reproducirMusica() {
		
		
	}

	public String getTipoReg() {
		return TipoReg;
	}

	public void setTipoReg(String tipoReg) {
		TipoReg = tipoReg;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
	}

}
