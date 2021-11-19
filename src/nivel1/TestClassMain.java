package nivel1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassMain extends Meses{

	@Test
	void exercici1() {
		Meses mes = new Meses();
		String[] meses = {"Enero", "Febrero", "Marzo","Abril", 
		                  "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
		                  "Octubre", "Noviembre", "Diciembre"};
		for(int i = 0; i < meses.length; i++) {
			mes.addMonth(meses[i]);
		}
		assertEquals(mes.getTamañoLista(), 12);
		assertTrue(mes.getTamañoLista() != 0);
		assertEquals(7, mes.getMes("Agosto"));
		
	}
	
	//Le doy mi número de DNI y como comparador en 'assertEquals' pongo la letra que tiene mi DNI;
	@Test
	void exercici2() {
		CalculoDni mi_dni=new CalculoDni(48098770);
		char letra_del_dni = mi_dni.dameNif().charAt(mi_dni.dameNif().length()-1);
		assertEquals(letra_del_dni, 'C');
	}
	

	@Test
	void exercici3() {
		//CREO QUE ESTO ES LA BUENA;
		assertThrows(ArrayIndexOutOfBoundsException.class, ()-> new Cercador(8));
	}	

}
