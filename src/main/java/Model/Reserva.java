/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author rafar
 */
public class Reserva {
    private int idReserva;
    Date checkIn;
    Date checkOut;
    String tipoQuarto;
    String quarto;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva(int idReserva, Date checkIn, Date checkOut, String tipoQuarto, String quarto) {
        this.idReserva = idReserva;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tipoQuarto = tipoQuarto;
        this.quarto = quarto;
    }

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

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", tipoQuarto=" + tipoQuarto + ", quarto=" + quarto + '}';
    }

}
