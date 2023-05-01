package models;

public class Cliente extends Vehiculo{
    private String nombre;
    private String dni;
    private boolean registroConducir=false;

    public Cliente() {
    }
    public Cliente(String modelo, int kilometros, int año, int codigo, int tarifaFija, String nombre, String dni, boolean registroConducir,int costo) {
        super(modelo, kilometros, año, codigo, tarifaFija,costo);
        this.nombre = nombre;
        this.dni = dni;
        this.registroConducir = registroConducir;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", registroConducir=" + registroConducir + "\n" + super.toString() +
                '}';
    }
}
