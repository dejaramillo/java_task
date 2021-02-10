package model;

public class Check {
   private String titular;
   private Double cantidad;

    public Check(String titular, Double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Usuario: "+titular+"\nSaldo de la cuenta: "+cantidad;
    }
}
