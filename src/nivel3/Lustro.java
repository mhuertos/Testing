package nivel3;

public class Lustro {
	
	private int indice = 0;
	private int[] a�os;
	
	public Lustro(int tama�o) {
		a�os = new int[tama�o];
			
	}
	
	public void afegeixAny(int a) throws ArrayIndexOutOfBoundsException {
		if(indice >= a�os.length) {
			throw new ArrayIndexOutOfBoundsException("Has superat el nombre de places.");
		}else {
			a�os[indice] = a;
			indice++;
		}		
	}
}
