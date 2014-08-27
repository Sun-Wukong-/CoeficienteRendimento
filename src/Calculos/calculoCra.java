package Calculos;

import Fabrica.Listas.listCrs;
import Periodo.disciplinas;

public class calculoCra {
	
	public float resuntadoCra(){
		
		//Instanciando Objetos
		listCrs crs = new listCrs();
		disciplinas disciplina = new disciplinas();
		
		//Inicializando Acumulo
		float somaCra = 0;
		
		//Calculando o CRA
		for(int i=0;i<crs.getListCrs().size();i++){
			somaCra += crs.getListCrs().get(i);	
		}
		somaCra = somaCra/disciplina.getNPeriodo();
		return somaCra;
	}
	  
}
