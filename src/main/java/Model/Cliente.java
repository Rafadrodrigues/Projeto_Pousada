/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rafar
 */
public class Cliente extends Pessoa {
    
    private int idCliente;
    /**
     * Características dos clientes
     * @param idCliente - Atributo que vai ser muito importante no Banco de Dados.
     * @param nome
     * @param cpf
     * @param endereco
     * @param email
     * @param telefone 
     */
    
    public Cliente(int idCliente,String nome, String cpf, String endereco, 
        String email, String telefone) {
        super(nome, cpf, endereco, email, telefone);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + '}';
    }
    
}
