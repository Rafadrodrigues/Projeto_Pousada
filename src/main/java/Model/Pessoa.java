/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe abstrata que vai servir como base para classes posteriores como funcionario e cliente.
 * @author rafar
 */
public abstract class Pessoa {
    
    /**
    * Atributos que serão em comum para todas as classes que vão herdar suas características
    * String nome;
    * String cpf;
    * String email;
    * String telefone;
    */
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    
    /**
    * Construtor parametrizado para inicializar a classse
    * @param nome      nome da pessoa.
    * @param cpf       CPF da pessoa.
    * @param email     e-mail da pessoa.
    * @param telefone  telefone da pessoa.
    */
    public Pessoa(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
    
    /**
     * Construtor padrão da classe em alguma necessidade de instânciação sem parâmetros.
     */
    public Pessoa(){
        
    }
    
    /**;
     * Getter para visualizar o atributo e Setter para alterar os atributos.
     * @return 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    /**
     * ToString para representar a classe em formato de string da classe
     * @return String
     */
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
}   
