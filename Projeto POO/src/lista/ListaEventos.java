package lista;
import modelo.CursoOnline;
import modelo.Evento;

public class ListaEventos {
	
	private int capacidadeEventos;
	private int qntEventos;
	private Evento[] eventos;
	
	public ListaEventos() {
		capacidadeEventos=10;
		qntEventos=0;
		eventos = new Evento[capacidadeEventos];
	}
	
	public boolean adicionarEvento(Evento evento) {
		if(qntEventos == eventos.length) {
			capacidadeEventos = capacidadeEventos*2;
		}
		
		if((evento != null) && (qntEventos < eventos.length)) {
			
			eventos[qntEventos] = evento;
			qntEventos++;

			return true;
		}

		return false;
	}
	
	public Evento[] getEvento() {
		return eventos;
	}
	
	public int getQntEventos() {
		return qntEventos;
	}


}
