package lista;
import modelo.CursoOnline;
import modelo.CursoPresencial;

public class ListaCursos {
	
	private int capacidadeCursosOnline;
	private int qntCursosOnline;
	private CursoOnline[] cursosOnline;
	
	private int capacidadeCursosPresencial;
	private int qntCursosPresencial;
	private CursoPresencial[] cursosPresenciais;
	
	public ListaCursos() {
		capacidadeCursosOnline=10;
		qntCursosOnline=0;
		cursosOnline = new CursoOnline[capacidadeCursosOnline];
		
		capacidadeCursosPresencial=10;
		qntCursosPresencial=0;
		cursosPresenciais = new CursoPresencial[capacidadeCursosPresencial];
	}
	
	public boolean adicionarCursoOnline(CursoOnline cursoOnline) {
		if((cursoOnline != null) && (qntCursosOnline < cursosOnline.length)) {
			
			cursosOnline[qntCursosOnline] = cursoOnline;
			qntCursosOnline++;

			return true;
		}

		return false;
	}
	
	public CursoOnline[] getCursosOnline() {
		return cursosOnline;
	}
	
	public int getQntCursosOnline() {
		return qntCursosOnline;
	}

	
	public boolean adicionarCursoPresencial(CursoPresencial cursoPresencial) {
		if((cursoPresencial != null) && (qntCursosPresencial < cursosPresenciais.length)) {
			
			cursosPresenciais[qntCursosPresencial] = cursoPresencial;
			qntCursosPresencial++;

			return true;
		}

		return false;
	}
	
	public CursoPresencial[] getCursosPresencial() {
		return cursosPresenciais;
	}
	
	public int getQntCursosPresencial() {
		return qntCursosPresencial;
	}

}
