package proiektua;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map; 

public class WebOrria {
	//atributuak
	private ArrayList<WebOrria> listaOrriak;
	private ArrayList<Gakoa> listaGakoak;
	
	private String url;
	private int index;
	
	 
	//eraikitzailea
	public WebOrria(String pUrl, int pIndex){
		this.listaOrriak=new ArrayList<WebOrria>();
		this.listaGakoak=new ArrayList<Gakoa>();
		this.url=pUrl;
		this.index=pIndex;
		
	}
	
	public int getIndexa() {
		return this.index;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public ArrayList<WebOrria> getOrria(){
		return this.listaOrriak;
	}
	
	public ArrayList<WebOrria> getListaOrriak(){
		return this.listaOrriak;
	}
	
	//Te da las url que contienen una palabra
	public boolean gakoWeb(String s) {
		if (this.url.contains(s)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Te da las paginas a las que se redirecciona una pagina
	public ArrayList<String> irteerakoEstekak(String s){
		ArrayList<String> e = new ArrayList<String>();
		int i = WebOrriak.getNireWebOrriak().String2id(s);
		e.add(this.listaOrriak.get(i).getUrl());
		return e;
	}
	
}