/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Classe que vai representar o financeiro do sistema
 * @author rafar
 */
public class Financeiro {
    
    /**
    * Atributos que representam característica do setor financeiro do sistema
    * String nome;
    * String cpf;
    * String email;
    * String telefone;
    */
    private int idFinanceiro;
    private String formaPagamento;
    private String parcelas;
    private float valorTotal;

    /**
     * Construtor parametrizado para inicializar a classse
     * @param idFinanceiro      Identificador do financeiro na base de dados
     * @param formaPagamento    Forma de pagamento escolhida pelo cliente (Dinheiro,pix,Cartão)
     * @param parcelas          Se for cartão de crédito, quantas parcelas foram
     * @param valorTotal        Valor total da reserva  
     */
    public Financeiro(int idFinanceiro, String formaPagamento, String parcelas, float valorTotal) {
        this.idFinanceiro = idFinanceiro;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
    }
    
    /**
     * Construtor padrão da classe em alguma necessidade de instânciação sem parâmetros.
    */
    public Financeiro(){ 
    }

    /**;
     * Getter para visualizar o atributo e Setter para alterar os atributos.
     * @return 
     */
    public int getIdFinanceiro() {
        return idFinanceiro;
    }

    public void setIdFinanceiro(int idFinanceiro) {
        this.idFinanceiro = idFinanceiro;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    /**
     * ToString para representar a classe em formato de string da classe
     * @return String
     */
    @Override
    public String toString() {
        return "Financeiro{" + "idFinanceiro=" + idFinanceiro + ", formaPagamento=" + formaPagamento + ", parcelas=" + parcelas + ", valorTotal=" + valorTotal + '}';
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
