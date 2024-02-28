/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 * Classe responsável por geren
 * @author rafar
 */
public class Reserva {
    
    /**
    * Atributos que representa a classe reserva
    * int idReserva;
    * Date checkIn;
    * Date checkOut;
    * String tipoQuarto;
    * String quarto;
    */
    
    private int idReserva;
    private Date checkIn;
    private Date checkOut;
    private String tipoQuarto;
    private String quarto;

    /**
     * Construtor parametrizado para inicializar a classse
     * @param idReserva     Identificador da reserva na base de dados
     * @param checkIn       Data de entrada na reserva
     * @param checkOut      Data de saida da reserva
     * @param tipoQuarto    Tipo de quarto(Luxo ou comum)
     * @param quarto        Número do quarto(1,2,3,4,5)
     */
    public Reserva(int idReserva, Date checkIn, Date checkOut, String tipoQuarto, String quarto) {
        this.idReserva = idReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tipoQuarto = tipoQuarto;
        this.quarto = quarto;
    }
    
    /**
     * Construtor padrão da classe em alguma necessidade de instânciação sem parâmetros.
     */
    public Reserva(){
    }
    /**;
     * Getter para visualizar o atributo e Setter para alterar os atributos.
     * @return 
     */
    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }
    
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    /**
     * ToString para representar a classe em formato de string da classe
     * @return String
     */
    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", tipoQuarto=" + tipoQuarto + ", quarto=" + quarto + '}';
    }
    
}
