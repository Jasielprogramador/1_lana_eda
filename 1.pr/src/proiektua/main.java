package proiektua;

import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		//COMPROBAR QUE TODO SE CARGA BIEN
		WebOrriak NireWebOrriak = WebOrriak.getNireWebOrriak();
		
		HashMap<String,WebOrria> map = NireWebOrriak.getHashMapFromTextFile();
		
		NireWebOrriak.ListaKargatu();
		
		Gakoak gakoak=new Gakoak();
		
		gakoak.listaKargatu();
		
		
		//CONSEGUIR UNA WEBORRIA
		WebOrria web=NireWebOrriak.getWebOrria("0-00.pl");
		
		System.out.println(web.getUrl());
		
		//METER UNA WEBORRIA
		WebOrria weba = new WebOrria("aaaaa",98);
		NireWebOrriak.webOrriTxertatu(weba);
		System.out.println(NireWebOrriak.getWebOrria("aaaaa").getUrl());
		
		//QUITAR UNA WEBORRIA FAAAALLLAAAAA
		NireWebOrriak.webOrriKendu(weba);
		
		if(NireWebOrriak.getWebOrria("aaaaa")==null) {
			System.out.println("Ezabatuta");
		}
		
		//MIRAR QUE WEBORRIS REDIRECCIONA UNA PAGINA
		ArrayList<String> e=web.irteerakoEstekak("0-00.pl");
		
		Iterator<String> itr=e.iterator();
		String a;
		while(itr.hasNext()) {
			a=itr.next();
			System.out.println(a);
		}
		
		//Gako-hitz bat emanda, gako-hitz hau duten web-orrien zerranda bueltatu FALLAAAAA
		Gakoa g=new Gakoa("chat");
		
		ArrayList<String> o=NireWebOrriak.word2Webs(g.getIzena());
		
		Iterator<String> itra=o.iterator();
		String j;
		while(itr.hasNext()) {
			j=itra.next();
			System.out.println(j);
		}
		
		
		
		//METER EN EL DOCUMENTO
		try {
        NireWebOrriak.dokumentuaSortu();
		}
		catch (IOException p){
			p.toString();
		}
		
		System.out.print("Dena ondo");
	}

}
