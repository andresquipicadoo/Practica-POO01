package practica;

public class GenerarReggaeton  extends GeneradorMusica{
	// Tipo del genero de canciones de reggeton como por ejemplo la salsa cubana 
	private String TipoReg;
	// Instrumento que suena en la cancion reggeton cual es string
	private String instrumentos;
    //Hereda de GeneradorMusica los metodos  GenerarCancion y ReproducirMusica
	public GenerarReggaeton(String genero, String letra,String Reg,String ins) {
		super(genero, letra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generarCancion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducirMusica() {
		// TODO Auto-generated method stub
		
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
