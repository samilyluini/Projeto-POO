package modelo;

public class Treinador {
	
	String nome;
	String formacao;
	
	public Treinador(String nome, String formacao) {
		this.nome = nome;
		this.formacao = formacao;
	}
	 
	public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }
    public String getFormacao(){
        return this.formacao;
    }

}
