/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Nessa classe eu optei por não ser herança de um cliente, visto que isso pode ser
 * diferenciado no momento da reserva.
 * @author rafar
 */
public class Funcionario extends Pessoa{
    
    private int idFuncionario;
    private String usuario;
    private String senha;
    
    /**
     * Características do funcionário
     * @param idFuncionario
     * @param nome
     * @param cpf
     * @param endereco
     * @param email
     * @param telefone 
     */
    
    public Funcionario(int idFuncionario, String nome, String cpf, String endereco, String email, String telefone) {
        super(nome, cpf, endereco, email, telefone);
        this.idFuncionario = idFuncionario;
    }

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

    @Override
    public String toString() {
        return "Funcionario{" + "idFuncionario=" + idFuncionario + ", usuario=" + usuario + ", senha=" + senha + '}';
    }
    
//    public enum Cargo {
//    FUNCIONARIO("FUNCIONARIO"),
//    ADMINISTRADOR("ADMINISTRADOR");
//
//    private final String valor;
//
//    Cargo(String valor) {
//        this.valor = valor;
//    }
//
//    public String getValor() {
//        return valor;
//    }
//    }
}
