package nivel1;

public class Cercador extends Exception {
	
	private int[] lista = new int[5];
	
	public Cercador(int index) throws ArrayIndexOutOfBoundsException{
		if(index >= lista.length) {
			throw new ArrayIndexOutOfBoundsException("index supera tamany array");
		}else {
			for(int i = 0; i< lista.length; i++) {
				lista[i] = i;
			}	
		} 
	}
}
