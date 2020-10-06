package proiektua;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		
		WebOrriak NireWebOrriak = WebOrriak.getNireWebOrriak();
		
		HashMap<String,WebOrria> map = NireWebOrriak.getHashMapFromTextFile();
		
		NireWebOrriak.ListaKargatu();
		
		Gakoak gakoak=new Gakoak();
		
		gakoak.listaKargatu();
		
		System.out.print("Dena ondo");
        
		int i =0;
		
	}

}
