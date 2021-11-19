package nivel1;

public class CalculoDni {
	
	private int numeroDni;
	private char letraDni;
	private String nif;
	
	public CalculoDni(int numDni) {
		numeroDni = numDni;
		letraDni = dameLetra();
		nif = String.valueOf(numDni)+letraDni;
	}
	
	private char dameLetra() {
		String abc = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = abc.charAt(numeroDni%abc.length());
		return letra;
	}
	
	public int dameDni() {
		return numeroDni;
	}
	
	public String dameNif() {
		return nif;
	}
	
	public char getChar() {
		return letraDni;
	}
	
	/*public char[] obtenerArrayLetras() {
		String abc = "abcdefghijklmnopqrstuvwxyz";
		char[] letras = new char[25];
		for(int i = 0; i < letras.length; i++) {
			letras[i] = abc.charAt(i);
		}
		return letras;
	}*/

}
