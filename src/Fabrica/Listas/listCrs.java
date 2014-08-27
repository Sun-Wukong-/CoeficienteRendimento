package Fabrica.Listas;

import java.util.*;

public class listCrs {
	
	//Criando ArrayList de CRs
	List <Float> listCr = new ArrayList<>();
	
	//Set - Add a lista uma nota
	public void setListCrs (float CR){
		listCr.add(CR);
	}
	
	//Get pegar a lista
	public List<Float> getListCrs (){
		return listCr;
	}

}
