package models;

public class Alquiler extends Cliente{
    private String fechaInicio;
    private String fechaFinal;

     public Alquiler(String modelo, int kilometros, int año, int codigo, int tarifaFija, String nombre, String dni, boolean registroConducir, int costo, String fechaInicio, String fechaFinal) {
        super(modelo, kilometros, año, codigo, tarifaFija, nombre, dni, registroConducir, costo*kilometros*3);
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
     @Override
    public String toString() {
        return "Alquiler{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFinal='" + fechaFinal + '\'' +
                '}'+ "\n" +super.toString();
    }
}
