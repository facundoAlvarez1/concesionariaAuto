package models;

public class Vehiculo {
    private String modelo;
    private int kilometros;
    private int año;
    private int codigo;
    private int tarifaFija = 2000;
    private int costo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, int kilometros, int año, int codigo, int tarifaFija,int costo) {
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.año = año;
        this.codigo = codigo;
        this.tarifaFija = tarifaFija;
        this.costo=costo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(int tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public int getCosto() {
        return costo;
    }

     @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kilometros=" + kilometros +
                ", año=" + año +
                ", codigo=" + codigo +
                ", tarifaFija=" + tarifaFija +
                ", costo=" + costo +
                '}';
    }
}
