package controlador;
import java.util.Scanner;

import lista.ListaCursos;
import lista.ListaEventos;
import lista.ListaTreinadores;
import modelo.Curso;
import modelo.CursoOnline;
import modelo.CursoPresencial;
import modelo.Evento;
import modelo.Treinador;

public class ControladorMenu {
	
	private String nome;
    private String descricao;
    private String cargaHoraria;
    private String telefone;
    private String email;
    private String link;
    
    private String dataInicio;
    private String dataTermino;
    private String local;
    private String endereco;
    
	private CursoOnline cursoOnline;
	private CursoPresencial cursoPresencial;
	
	private String formacao;
	
	private Treinador treinador;
	private String nomeTreinador;
	
	private ListaCursos listaCursos = new ListaCursos();
	
    private String dataEvento;
    
    private Evento evento;
    
    private String textoBuscar;
    private ListaEventos listaEventos = new ListaEventos();
    
    private ListaTreinadores listaTreinadores;
	
	Scanner ler = new Scanner(System.in);
	
	 public int exibirMenu() {

	        System.out.println("Escolha uma das op��es abaixo:");
	        System.out.println("Op��o '1' - Cadastrar curso");
	        System.out.println("Op��o '2' - Cadastrar evento");
	        System.out.println("Op��o '3' - Atualizar curso");
	        System.out.println("Op��o '4' - Atualizar evento");
	        System.out.println("Op��o '5' - Deletar curso");
	        System.out.println("Op��o '6' - Deletar evento");
	        System.out.println("Op��o '7' - Buscar curso ou evento");
	        System.out.println("Op��o '8' - Listar cursos e eventos");
	        System.out.println("Op��o '9' - Sair");
	        
	        return ler.nextInt();
	        
	    }
	   
	    public void escolherModalidade() {
	    	
	    	int modalidade;
	        
	        System.out.println("Selecione uma das op��es de modalidade do curso a ser cadastrado:");
	        System.out.println("Op��o '1' - Online");
	        System.out.println("Op��o '2' - Presencial");
	        modalidade=ler.nextInt();
	        
	        if(modalidade == 1){
	            cursoOnline = receberInformacoesCursoOnline();
	            listaCursos.adicionarCursoOnline(cursoOnline);
	        }
	        else if(modalidade == 2){
	        	cursoPresencial = receberInformacoesCursoPresencial();
	            listaCursos.adicionarCursoPresencial(cursoPresencial);
	        }
	        else{
	            System.out.println("Op��o inv�lida.");
	        }
	    }
	    
	    public CursoOnline receberInformacoesCursoOnline() {

	        System.out.println("Digite o nome do curso:");
	        nome=ler.nextLine();
	        
	        ler.nextLine();
	        
	        System.out.println("Digite a descri��o:");
	        descricao=ler.nextLine();
	 
	        System.out.println("Digite a carga hor�ria:");
	        cargaHoraria=ler.nextLine();

	        System.out.println("Digite o telefone de contato:");
	        telefone=ler.nextLine();
	        
	        System.out.println("Digite o email de contato:");
	        email=ler.nextLine();
	        
	        System.out.println("Digite o link para mais informa��es:");
	        link=ler.nextLine();
	        
	        cursoOnline = new CursoOnline(nome, descricao, cargaHoraria, telefone, email, link);
	        
	        return cursoOnline;
	    }
	    
	    public CursoPresencial receberInformacoesCursoPresencial() {
	    	
	    	System.out.println("Digite o nome do curso:");
	        nome=ler.nextLine();
	        
	        ler.nextLine();
	        
	        System.out.println("Digite a descri��o:");
	        descricao=ler.nextLine();
	 
	        System.out.println("Digite a carga hor�ria:");
	        cargaHoraria=ler.nextLine();
	        
	        System.out.println("Digite a data de in�cio:");
	        dataInicio=ler.nextLine();
	        
	        System.out.println("Digite a data de t�rmino:");
	        dataTermino=ler.nextLine();
	        
	        System.out.println("Digite o telefone de contato:");
	        telefone=ler.nextLine();
	        
	        System.out.println("Digite o email de contato:");
	        email=ler.nextLine();
	        
	        System.out.println("Digite o link para mais informa��es:");
	        link=ler.nextLine();
	        
	        System.out.println("Digite o local de realiza��o:");
	        local=ler.nextLine();
	        
	        System.out.println("Digite o endere�o:");
	        endereco=ler.nextLine();
	        
	        treinador = receberInformacoesTreinadores();
	        
	        cursoPresencial = new CursoPresencial(nome, descricao, cargaHoraria, dataInicio, dataTermino, 
	        										telefone, email, link, local, endereco, treinador);
	        
	        return cursoPresencial;
	    }
	    
	    public Treinador receberInformacoesTreinadores() {
	    	
	    	int capacidade;
	    	
	    	System.out.println("Digite a quantidade de treinadores:");
	    	capacidade=ler.nextInt();
	    	listaTreinadores = new ListaTreinadores(capacidade);
	    	
	    	for(int i=0; i<2; i++) {
	    		
	    		System.out.println("Digite o nome do(a) treinador(a):");
		        nomeTreinador=ler.nextLine();
		        
		        ler.nextLine();
		        
		        System.out.println("Digite a forma��o:");
		        formacao=ler.nextLine();
		        
		        treinador = new Treinador(nomeTreinador, formacao);
		        
		        listaTreinadores.adicionarTreinador(treinador);
	    	}
	    	
	        
	        return treinador;
	       
	    }
	    
	    public Evento receberInformacoesEvento() {
	    	
	    	System.out.println("Digite o nome do evento:");
	        nome=ler.nextLine();
	        
	        ler.nextLine();
	        
	        System.out.println("Digite a descri��o:");
	        descricao=ler.nextLine();
	 
	        System.out.println("Digite a carga hor�ria:");
	        cargaHoraria=ler.nextLine();
	        
	        System.out.println("Digite a data de realiza��o:");
	        dataEvento=ler.nextLine();

	        System.out.println("Digite o telefone de contato:");
	        telefone=ler.nextLine();
	        
	        System.out.println("Digite o email de contato:");
	        email=ler.nextLine();
	        
	        System.out.println("Digite o link para mais informa��es:");
	        link=ler.nextLine();
	        
	        System.out.println("Digite o local de realiza��o:");
	        local=ler.nextLine();
	        
	        System.out.println("Digite o endere�o:");
	        endereco=ler.nextLine();
	        
	        treinador = receberInformacoesTreinadores();
	        
	        evento = new Evento(nome, descricao, cargaHoraria, dataEvento, telefone, email, link, 
	        					local, endereco, treinador);
	        
	        listaEventos.adicionarEvento(evento);
	        
	        return evento;
	    }
	    
	    public void setCursoOnline() {
	    	
	    	System.out.println("Selecione o campo para atualizar");
	    	System.out.println("Op��o '1' - Nome");
	        System.out.println("Op��o '2' - Descri��o");
	        System.out.println("Op��o '3' - Carga Hor�ria");
	        System.out.println("Op��o '4' - Telefone");
	        System.out.println("Op��o '5' - E-mail");
	        System.out.println("Op��o '6' - Link");
	        System.out.println("Op��o '7' - ");

	    }
	   
	   public void buscarTodos() {
		   
		  System.out.println("Digite o texto a ser buscado:");
		  ler.nextLine();
		  textoBuscar=ler.nextLine();
		  CursoOnline  cursoOnline = buscarCursoOnline(textoBuscar);
		  CursoPresencial cursoPresencial = buscarCursoPresencial(textoBuscar);
		  Evento evento = buscarEvento(textoBuscar);
		  
		  if(cursoOnline != null) {
			  System.out.println(cursoOnline.getNome());
			  System.out.println(cursoOnline.getDescricao());
		  }
		  if(cursoPresencial != null) {
			  System.out.println(cursoPresencial.getNome());
			  System.out.println(cursoPresencial.getDescricao());
		  }
		  if(evento != null) {
			  System.out.println(evento.getNome());
			  System.out.println(evento.getDescricao());
		  }
		  
	   }
	   
	   public CursoOnline buscarCursoOnline(String textoBuscar) {
		  CursoOnline[] cursosOnline = listaCursos.getCursosOnline();
		  for(int i = 0; i < listaCursos.getQntCursosOnline(); i++) {
			  
			  if(cursosOnline[i].getNome() != null || cursosOnline[i].getNome() != "") {
				  System.out.println(cursosOnline[i].getNome());
			  }
			  
			  if(cursosOnline[i].getNome().contains(textoBuscar) || cursosOnline[i].getDescricao().contains(textoBuscar)) {
				  return cursosOnline[i];
			  }
		  }
			return null;
		}
	   public CursoPresencial buscarCursoPresencial(String textoBuscar) {
		   CursoPresencial[] cursoPresencial = listaCursos.getCursosPresencial();
		   for(int i = 0; i < listaCursos.getQntCursosPresencial(); i++) {
				  
			   if(cursoPresencial[i].getNome().toLowerCase().contains(textoBuscar.toLowerCase()) 
					   || cursoPresencial[i].getDescricao().contains(textoBuscar)) {
				   return cursoPresencial[i];
				}
		   }
			
			return null;
		}
	   public Evento buscarEvento(String textoBuscar) {
		   Evento[] evento = listaEventos.getEvento();
		   for(int i = 0; i < listaEventos.getQntEventos(); i++) {
				  
			   if(evento[i].getNome().contains(textoBuscar) || evento[i].getDescricao().contains(textoBuscar)) {
				   return evento[i];
				}
		   }
		   
			return null;
		}

}
