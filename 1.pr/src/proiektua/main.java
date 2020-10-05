package proiektua;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		
		WebOrriak NireWebOrriak = WebOrriak.getNireWebOrriak();
		
		HashMap<String,WebOrria> map = NireWebOrriak.getHashMapFromTextFile();
		
		NireWebOrriak.ListaKargatu();
		
		System.out.print("pene");
		
		Gakoak gakoak=new Gakoak();
		
		gakoak.listaKargatu();
        
		int i =0;
		
		
	}

}
