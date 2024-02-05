/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rafar
 */
public class Reserva {
    private int idReserva;
    private String nomeCliente;
    private String cpfCliente;
    private String nomeFuncionario;
    private int qtdDiaria;

    public Reserva(int idReserva, String nomeCliente, String cpfCliente, String nomeFuncionario, int qtdDiaria) {
        this.idReserva = idReserva;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.qtdDiaria = qtdDiaria;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(int qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + ", nomeFuncionario=" + nomeFuncionario + ", qtdDiaria=" + qtdDiaria + '}';
    }
    
    
}
