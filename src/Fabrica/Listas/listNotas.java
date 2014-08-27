package Fabrica.Listas;

import java.util.*;

public class listNotas {
		
		//Criando Array de notas
		List<Float> listNotas = new ArrayList<>();
		
		//Set - Add a lista uma nota
		public void setListNotas (float notas){
			listNotas.add(notas);
		}
        
		//Get pegar a lista
		public List<Float> getListNotas (){
			return listNotas;
		}
	
}


