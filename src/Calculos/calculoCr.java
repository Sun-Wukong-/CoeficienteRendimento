package Calculos;

import Fabrica.Listas.*;

public class calculoCr {
	
	public float resuntadoCr(){
		
		//Instanciando Objetos
		listNotas notas = new listNotas();
		listCreditos creditos = new listCreditos();
		listCrs Cr = new listCrs();
		
		//Inicializando Acumulo
		float somaCr = 0;
		
		//Calculando o CR
		for(int i=0; i<notas.getListNotas().size();i++){
			somaCr += (notas.getListNotas().get(i) * creditos.getListCreditos().get(i));
			
		}
		//Adicionando o CR a lista de CRs
		Cr.setListCrs(somaCr);
		
		//Limpando as Listas
		notas.getListNotas().clear();
		creditos.getListCreditos().clear();
		
		return somaCr;
	}

}
