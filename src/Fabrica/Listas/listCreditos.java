package Fabrica.Listas;

import java.util.*;

public class listCreditos {

    //Criando Array de Creditos
	List <Integer> listCreditos = new ArrayList<>();
	
	//Set - Add a lista uma nota
	public void setListCreditos (int creditos){
		listCreditos.add(creditos);
	}

	//Get pegar a lista
    public List<Integer> getListCreditos (){
    	return listCreditos;
    }
    
    
         
}
