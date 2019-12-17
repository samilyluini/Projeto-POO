package modelo;
import java.util.Scanner;

public class CursoPresencial extends Curso
{
    private String dataInicio;
    private String dataTermino;
    private String local;
    private String endereco;
    private Treinador treinador;
    

	public CursoPresencial(String nome, String descricao, String cargaHoraria, String telefone,
							String email, String link, String dataInicio, String dataTermino, String local, String endereco,
							Treinador treinador) {
	super(nome, descricao, cargaHoraria, telefone, email, link);
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.local = local;
		this.endereco = endereco;
		this.treinador = treinador;
	}
	
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    public String getDataInicio(){
        return this.dataInicio;
    }
    public void setDataTermino(String dataTermino){
        this.dataTermino = dataTermino;
    }
    public String getDataTermino(){
        return this.dataTermino;
    }
    public void setLocal(String local){
        this.local = local;
    }
    public String getLocal(){
        return this.local;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String endereco(){
        return this.endereco;
    }
   
 }