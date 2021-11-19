package nivel3;

public class Lustro {
	
	private int indice = 0;
	private int[] años;
	
	public Lustro(int tamaño) {
		años = new int[tamaño];
			
	}
	
	public void afegeixAny(int a) throws ArrayIndexOutOfBoundsException {
		if(indice >= años.length) {
			throw new ArrayIndexOutOfBoundsException("Has superat el nombre de places.");
		}else {
			años[indice] = a;
			indice++;
		}		
	}
}
