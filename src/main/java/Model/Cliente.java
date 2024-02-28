/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe responsável por representar os clientes do sistema.Cliente 
 * é uma herança da classe abstrata Pessoa
 * @author rafar
 */
public class Cliente extends Pessoa {
    
    /**
    * Atributo que representa a classe cliente
    * int idCliente;
    */
    private int idCliente;

    /**
     * Construtor parametrizado para inicializar a classse
    * @param idCliente - Atributo que vai ser muito importante no Banco de Dados.
    * @param nome     nome da pessoa.
    * @param cpf       CPF da pessoa.
    * @param email     e-mail da pessoa.
    * @param telefone  telefone da pessoa.
    */
    
    public Cliente(int idCliente,String nome, String cpf,
        String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.idCliente = idCliente;
    }

    /**
     * Construtor padrão para inicialização da classe sem parâmetro, caso necessário.
     */
    public Cliente() {
    }

    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Representação da classe em formato de String
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + '}';
    }
   
}
