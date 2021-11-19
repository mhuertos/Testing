package nivel3;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;



class TestClassMain {

	@Test
	void exercici1_test_acierta() {
		assertThat(7).isEqualTo(7);
	}
	
	@Test
	void exercici1_test_falla() {
		assertThat(7).isEqualTo(7);
		assertThat(5).isEqualTo(3);
	}
	
	@Test
	void exercici2_test_acierta() {
		Empleado emp_1 = new Empleado("Juan");
		assertThat(emp_1).isEqualTo(emp_1);
	}
	
	@Test
	void exercici2_test_fallo() {
		Empleado emp_1 = new Empleado("Juan");
		Empleado emp_2 = new Empleado("Ana");
		assertThat(emp_1).isEqualTo(emp_2);
	}
	
	@Test
	void exercici3_test() {
		int[] lista = {3, 5, 23, 9};
		int[] lista_2 = {3, 5, 23, 9};
		assertThat(lista).isEqualTo(lista_2);
	}
	
	@Test
	void exercici4_test_ordenInsercion() {
		ArrayList <Empleado> personal = new ArrayList<Empleado>();
		Empleado emp_1 = new Empleado("Oscar");
		Empleado emp_2 = new Empleado("Lara");
		Empleado emp_3 = new Empleado("Tarzan");
		
		personal.add(emp_3);
		personal.add(emp_2);
		personal.add(emp_1);
		
		assertThat(personal.get(0)).isEqualTo(emp_3);
		assertThat(personal.get(1)).isEqualTo(emp_2);
		assertThat(personal.get(2)).isEqualTo(emp_1);
	}
	
	@Test
	void exercici4_test_verificaRepetido() {
		ArrayList <Empleado> personal = new ArrayList<Empleado>();
		Empleado emp_1 = new Empleado("Oscar");
		Empleado emp_2 = new Empleado("Lara");
		Empleado emp_3 = new Empleado("Tarzan");
		
		personal.add(emp_3);
		personal.add(emp_2);
		personal.add(emp_1);
		personal.add(emp_3);
		
		//assertThat(emp_3).isIn(personal).
		assertThat(personal).containsOnlyOnce(emp_1, emp_2, emp_3);
	}
	
	@Test
	void exercici4_test_verificaNoExistencia() {
		ArrayList <Empleado> personal = new ArrayList<Empleado>();
		Empleado emp_1 = new Empleado("Oscar");
		Empleado emp_2 = new Empleado("Lara");
		Empleado emp_3 = new Empleado("Tarzan");
		
		personal.add(emp_3);
		personal.add(emp_2);
		
		assertThat(personal).contains(emp_1);
	}
		
	
	@Test
	void exercici5_test() {
		HashMap<Integer, Empleado> mp = new HashMap<Integer, Empleado>();
		mp.put(1, new Empleado("Sabrina"));
		mp.put(2, new Empleado("Javier"));
		mp.put(3, new Empleado("Diva"));
		
		assertThat(mp).containsKey(4);
	}
	
	@Test
	void exercici6_test() {
		
		Lustro cal = new Lustro(5);
		
		cal.afegeixAny(1992);
		cal.afegeixAny(1993);
		cal.afegeixAny(1994);
		cal.afegeixAny(1995);
		cal.afegeixAny(1996);
		//cal.afegeixAny(1997);
			
		/*assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {	
			cal.afegeixAny(1997);
		});*/
		
		assertThatThrownBy(() -> cal.afegeixAny(1997))
		.isInstanceOf(ArrayIndexOutOfBoundsException.class);
		
	}
	
	@Test
	void exercici7_test() {
		Optional obj = new Optional();
		assertThat(obj).isNull();
	}
	
	
	
	
	
	
	
	
	
	

}
