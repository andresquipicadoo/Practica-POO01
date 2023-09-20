package practica;

public abstract class GeneradorMusica {
	
	//Clase principal donde se genera la letraGenerosMusicales de  los generos musicales 
	private String GeneroCanciones;
	private String letraGenerosMusicales;
	 public GeneradorMusica(String genero, String letra) {
	        this.setGeneroCanciones(genero);
	        this.setLetraGenerosMusicales(letra);
	    }

	    
	    public abstract void generarCancion();
	    public abstract void reproducirMusica();


		public String getGeneroCanciones() {
			return GeneroCanciones;
		}


		public void setGeneroCanciones(String generoCanciones) {
			GeneroCanciones = generoCanciones;
		}


		public String getLetraGenerosMusicales() {
			return letraGenerosMusicales;
		}


		public void setLetraGenerosMusicales(String letraGenerosMusicales) {
			this.letraGenerosMusicales = letraGenerosMusicales;
		}

}
