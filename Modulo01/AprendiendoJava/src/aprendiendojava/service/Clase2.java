package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @email gcoronelc@gmail.com
 * @blog http://www.desarrollasoftware.com/
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @cursos https://gcoronelc.github.io/
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 */
public class Clase2 extends Clase1{

	public Clase2() {
		super(); // llama al constructor del padre: Clase 1
	}
	

	@Override
	public int suma(int n1, int n2) {
		System.out.println("Ejecutando suma de Clase2.");
		int resultado = (n1+n2)*(n1-n2);
		return resultado;
	}
	
	public long fact(int n){
		if(n==0 || n==1) return 1;
		else return n * fact(n-1);
	}
	
	
}
