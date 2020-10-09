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
		
		//QUITAR UNA WEBORRIA 
		NireWebOrriak.webOrriKendu(weba);
		
		if(NireWebOrriak.getWebOrria("aaaaa")==null) {
			System.out.println("Ezabatuta");
		}
		
		//MIRAR QUE WEBORRIS REDIRECCIONA UNA PAGINA
		ArrayList<String> e=web.irteerakoEstekak("0-00.pl");
		
		
		for(int i=0;i<e.size();i++) {
			
			System.out.println(e.get(i));
			
		}
		
		System.out.print("WORD2WEBS");
		
		//Gako-hitz bat emanda, gako-hitz hau duten web-orrien zerranda bueltatu 
		Gakoa g=new Gakoa("chat");
		
		ArrayList<String> o=NireWebOrriak.word2Webs(g.getIzena());
		
		for(int i=0;i<e.size();i++) {
			
			System.out.println(o.get(i));
			
		}
		
		//ORDENAR EL DOCUMENTO
		NireWebOrriak.webOrdenatua();
		
		for(int i=0;i<e.size();i++) {
			
			System.out.println(NireWebOrriak.getUrlLista().get(i));
			
		}
		
		//METER EN EL DOCUMENTO
		
		System.out.println("Dokumentuan sartu");
		
		try {
        NireWebOrriak.dokumentuaSortu();
		}
		catch (IOException p){
			p.toString();
		}
		
		
		
		System.out.print("Dena ondo");
	}

}
