package lista;

import modelo.Evento;
import modelo.Treinador;

public class ListaTreinadores {
	
	private int capacidadeTreinadores;
	private int qntTreinadores;
	private Treinador[] treinadores;
	
	public ListaTreinadores(int capacidade) {
		capacidadeTreinadores=capacidade;
		qntTreinadores=0;
		treinadores = new Treinador[capacidadeTreinadores];
	}
	
	public boolean adicionarTreinador(Treinador treinador) {
		if((treinadores != null) && (qntTreinadores < treinadores.length)) {
			
			treinadores[qntTreinadores] = treinador;
			qntTreinadores++;

			return true;
		}

		return false;
	}
	
	public Treinador[] getTreinador() {
		return treinadores;
	}
	public int getQntTreinadores() {
		return qntTreinadores;
	}
	
}
