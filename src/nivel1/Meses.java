package nivel1;

import java.util.ArrayList;
public class Meses {

	private ArrayList<String> months = new ArrayList<String>();
	
	public Meses() {
	}
	
	public void addMonth(String m) {
		this.months.add(m);
	}
	
	public void showList() {
		System.out.println(months);
	}
	
	public int getTamañoLista() {
		return months.size();
	}
	public int getMes(String m) {
		return months.indexOf(m);
	}

}
