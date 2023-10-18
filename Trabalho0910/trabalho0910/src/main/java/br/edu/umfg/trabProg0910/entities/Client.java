package br.edu.umfg.trabProg0910.entities;

public class Client {
    private Long id;
    private String nome;
    private String sobrenome;
    private String documento;



    //getters and setters
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {return sobrenome;}

    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public String getDocumento() {return documento;}

    public void setDocumento(String documento) {this.documento = documento;}
}
