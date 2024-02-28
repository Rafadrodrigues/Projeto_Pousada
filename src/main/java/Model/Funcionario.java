/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Nessa classe eu optei por não ser herança de um cliente, visto que isso pode ser
 * diferenciado no momento da reserva. Funcionario é uma herança da classe abstrata Pessoa.
 * @author rafar
 */
public class Funcionario extends Pessoa{
    
    /**
    * Atributos que representa a classe funcionario
    * int idFuncionario;
    * String usuario;
    * String senha;
    * String endereco;
    */
    private int idFuncionario;
    private String usuario;
    private String senha;
    private String endereco;
    
   
    /**
     * Construtor parametrizado para inicializar a classe
     * @param idFuncionario     Identicador do Funcionario na base de dados 
     * @param usuario           Usuario de acesso do sistema do funcionario
     * @param senha             Senha de acesso do sistema do funcionario
     * @param endereco          Endereco do funcionario
     * @param nome              Nome do funcionario
     * @param cpf               CPF do funcionario
     * @param email             Email do funcionario
     * @param telefone          Telefone do funcionario
     */
    public Funcionario(int idFuncionario, String usuario, String senha, String endereco, String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.idFuncionario = idFuncionario;
        this.usuario = usuario;
        this.senha = senha;
        this.endereco = endereco;
    }

    /**
     * Construtor padrão da classe em alguma necessidade de instânciação sem parâmetros.
     */
    public Funcionario(){
        
    }
    
    /**;
     * Getter para visualizar o atributo e Setter para alterar os atributos.
     * @return 
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /**
     * ToString para representar a classe em formato de string da classe
     * @return String
     */
    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", usuario=" + usuario + ", senha=" + senha + ", endereco=" + endereco + '}';
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
