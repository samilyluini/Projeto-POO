package modelo;

public abstract class Curso{
    private String nome;
    private String descricao;
    private String cargaHoraria;
    private String telefone;
    private String email;
    private String link;
    
    public Curso(String nome, String descricao, String cargaHoraria, String telefone, String email, String link) {
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.telefone = telefone;
		this.email = email;
		this.link = link;
	}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setCargaHoraria(String cargaHoraria){
        this.cargaHoraria=cargaHoraria;
    }
    public String getCargaHoraria(){
        return cargaHoraria ;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public String getTelefone(){
        return telefone;
    }
      public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
      public void setLink(String link){
        this.link=link;
    }
    public String getLink(){
        return link;
    }
    

}