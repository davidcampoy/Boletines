package objetos;

public class Dimensiones {
	
	private float x;	// Ancho
	private float y;	// Alto
	private float z;	// Fondo
	
	public Dimensiones() {
		
		x = 0;
		y = 0;
		z = 0;
		
	}
	
	public Dimensiones(float x, float y, float z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	void setX (float x) {
		this.x = x;
	}
	
	float getX() {
		return x;
	}
	
	void setY (float y) {
		this.y = y;
	}
	
	float getY() {
		return y;
	}
	
	void setZ(float z) {
		this.z = z;
	}
	
	float getZ() {
		return z;
	}
	
	float alturaMaximaParaApilar(float alturaMaxima) {
		
		return alturaMaxima - y;
		
	}
	
	float sumaDimensionesX(Dimensiones dimensiones) {
		
		return this.x + dimensiones.x;
		
	}
	
	float sumaDimensionesY(Dimensiones dimensiones) {
		
		return this.y + dimensiones.y;
		
	}
	
	float sumaDimensionesZ(Dimensiones dimensiones) {
		
		return this.z + dimensiones.z;
		
	}
	
	public String toString() {
		
		return String.format("Dimensiones: x = %.1f ; y = %.1f ; z = %.1f", x, y, z);
		
	}
	
	boolean esPosibleApilarPaquetes(Dimensiones dimensionesOtroPaquete, float alturaMaximaParaApilar) {
		
		if(sumaDimensionesY(dimensionesOtroPaquete) <= alturaMaximaParaApilar) {
			return true;
		}else {
			return false;
		}
		
	}
	
	void girarDimensionX() {
		
		float aidX = x, aidZ = z;
		
		x = aidZ;
		z = aidX;
		
	}
	
	void girarDimensionY() {
		
		float aidX = x, aidY = y;
		
		x = aidY;
		y = aidX;
		
	}
	
	void girarDimensionZ() {
		
		float aidY = y, aidZ = z;
		
		y = aidZ;
		z = aidY;
		
	}
	
	String apilarPaquetes(Dimensiones dimensionesOtroPaquete, float alturaMaximaParaApilar) {
		
		String soluciones = "";
		
		if(sumaDimensionesX(dimensionesOtroPaquete) <= alturaMaximaParaApilar) {
			soluciones += "Dimension X del primer paquete sobre la dimension X del segundo paquete.\n";
		}
		
		if(getX() + dimensionesOtroPaquete.getY() <= alturaMaximaParaApilar) {
			soluciones += "Dimension X del primer paquete sobre la dimension Y del segundo paquete.\n";
		}
		
		if(getX() + dimensionesOtroPaquete.getZ() <= alturaMaximaParaApilar) {
			soluciones += "Dimension X del primer paquete sobre la dimension Z del segundo paquete.\n";
		}
		
		if(sumaDimensionesY(dimensionesOtroPaquete) <= alturaMaximaParaApilar) {
			soluciones += "Dimension Y del primer paquete sobre la dimension Y del segundo paquete.\n";
		}
		
		if(getY() + dimensionesOtroPaquete.getZ() <= alturaMaximaParaApilar) {
			soluciones += "Dimension Y del primer paquete sobre la dimension Z del segundo paquete.\n";
		}
		
		if(sumaDimensionesZ(dimensionesOtroPaquete) <= alturaMaximaParaApilar) {
			soluciones += "Dimension Z del primer paquete sobre la dimension Z del segundo paquete.\n";
		}
		
		if(soluciones.equals("")) {
			
			return String.format("No hay soluciones posibles.");
			
		}else {
			
			return soluciones;
			
		}
		
	}

}
