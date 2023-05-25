package pe.egcc.pagoapp.excepciones;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class NumerosPositivos extends Exception{

	public NumerosPositivos() {
		super("El dato deben ser un numero positivo.");
	}

	public NumerosPositivos(String mensaje) {
		super(mensaje);
	}
}
